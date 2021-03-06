package de.training.docker.blog.repository;

import de.training.docker.blog.repository.model.AuthorEntity;
import de.training.docker.blog.repository.model.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<PostEntity, Long> {
    List<PostEntity> getByAuthor(AuthorEntity author);
}