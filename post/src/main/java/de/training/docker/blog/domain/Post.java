package de.training.docker.blog.domain;

import lombok.*;

import java.util.Date;

@Builder
@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class Post {
    private String headline;
    private String content;
    private Author author;
    private Date postedOn;
}
