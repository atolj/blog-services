package de.training.docker.blog.mapper;

import de.training.docker.blog.domain.Author;
import de.training.docker.blog.repository.model.AuthorEntity;

public class AuthorMapper {

    public Author map(AuthorEntity authorEntity) {
        return Author.builder()
                .name(authorEntity.getName())
                .surname(authorEntity.getSurname())
                .email(authorEntity.getEmail())
                .build();
    }

    public AuthorEntity map(Author author) {
        AuthorEntity authorEntity = new AuthorEntity();
        return authorEntity;
//        return new AuthorEntity(author.getName())
//                .surname(author.getSurname())
//                .email(author.getEmail())
//                .build();
    }
}
