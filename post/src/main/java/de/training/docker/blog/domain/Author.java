package de.training.docker.blog.domain;

import lombok.*;

@Builder
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Getter
public class Author {
    private String name;
    private String surname;
    private String email;
}
