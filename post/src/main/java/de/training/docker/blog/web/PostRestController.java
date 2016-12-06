package de.training.docker.blog.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostRestController {

    public static final String REQUEST_URI = "/api/{content}";

    //TODO define API
    @RequestMapping(value = REQUEST_URI, method = RequestMethod.GET)
    public String request(@PathVariable("content") String ping) {
        if (ping == null || ping.isEmpty() || !"ping".equals(ping)) {
            return "You do not really expect a pong without a ping, do you? try ../ping";
        } else {
            return "pong";
        }
    }


    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public RequestError handle(IllegalArgumentException illegalArgument) {
        return new RequestError(illegalArgument.getMessage());
    }


}
