package de.training.docker.blog.repository.model;

import java.util.Date;

public class PostEntity {
    private String headline;
    private String content;
    private AuthorEntity author;
    private Date postedOn;
}
