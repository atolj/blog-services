package de.training.docker.blog.web;

import de.training.docker.blog.mapper.PostMapper;
import de.training.docker.blog.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Date;
import java.util.Map;

@Controller
@AllArgsConstructor
public class PostWebController {

    private PostRepository postrepository;
    private PostMapper postMapper;

    @GetMapping(value = "/posts")
    public String postList(Map<String, Object> model){
        model.put("time", new Date());
        model.put("message", "Hallo Alen!");
        return "posts";
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public RequestError handle(IllegalArgumentException illegalArgument) {
        return new RequestError(illegalArgument.getMessage());
    }
}
