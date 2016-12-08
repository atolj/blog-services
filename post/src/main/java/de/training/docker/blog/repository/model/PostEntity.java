package de.training.docker.blog.repository.model;

import lombok.AllArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "post")
@AllArgsConstructor
public class PostEntity {

    // An autogenerated id (unique for each user in the db)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String headline;
    @NotNull
    private String content;

    @ManyToOne
    private AuthorEntity author;

}
