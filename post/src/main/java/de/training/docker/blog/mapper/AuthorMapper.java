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
        authorEntity.setName(author.getName());
        authorEntity.setSurname(author.getSurname());
        authorEntity.setEmail(author.getEmail());
        return authorEntity;
    }
}
