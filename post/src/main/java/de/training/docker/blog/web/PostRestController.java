package de.training.docker.blog.web;

import de.training.docker.blog.domain.Post;
import de.training.docker.blog.mapper.PostMapper;
import de.training.docker.blog.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
public class PostRestController {

    private PostRepository postrepository;
    private PostMapper postMapper;

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public List<Post> getAllPosts(){
        return postrepository.findAll()
                .stream()
                .map(post -> postMapper.map(post))
                .collect(Collectors.toList());
    }

    @RequestMapping(value = "/post/{id}", method = RequestMethod.PUT)
    public void addPost(@PathVariable("id") long id, @RequestBody Post post){
        postrepository.save(postMapper.mapToEntity(id, post));
    }

    @RequestMapping(value = "/post/{id}", method = RequestMethod.GET)
    public Post getPost(@PathVariable("id") long id){
        return postMapper.map(postrepository.getOne(id));
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public RequestError handle(IllegalArgumentException illegalArgument) {
        return new RequestError(illegalArgument.getMessage());
    }
}
