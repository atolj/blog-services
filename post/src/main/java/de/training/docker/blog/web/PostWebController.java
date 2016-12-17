package de.training.docker.blog.web;

import de.training.docker.blog.domain.Post;
import de.training.docker.blog.mapper.PostMapper;
import de.training.docker.blog.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@AllArgsConstructor
public class PostWebController {

    private PostRepository postrepository;
    private PostMapper postMapper;

    @GetMapping(value = "/posts")
    public String postList(Map<String, Object> model){
        List<Post> posts = postrepository.findAll()
                .stream()
                .map(post -> postMapper.map(post))
                .collect(Collectors.toList());


        model.put("posts", posts);
        model.put("message", "Hallo Alen!");
        return "posts";
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public RequestError handle(IllegalArgumentException illegalArgument) {
        return new RequestError(illegalArgument.getMessage());
    }
}
