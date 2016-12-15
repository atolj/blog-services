package de.training.docker.blog.config;


import de.training.docker.blog.mapper.AuthorMapper;
import de.training.docker.blog.mapper.PostMapper;
import de.training.docker.blog.repository.PostRepository;
import de.training.docker.blog.web.PostRestController;
import de.training.docker.blog.web.PostWebController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PostConfig {

    @Autowired
    private PostRepository postRepository;

    @Bean
    public AuthorMapper authorMapper(){
        return new AuthorMapper();
    }

    @Bean
    public PostMapper postMapper(){
        return new PostMapper(authorMapper());
    }

    @Bean
    public PostRestController postRestController(){
        return new PostRestController(postRepository, postMapper());
    }


    @Bean
    public PostWebController postWebController(){
        return new PostWebController(postRepository, postMapper());
    }


}
