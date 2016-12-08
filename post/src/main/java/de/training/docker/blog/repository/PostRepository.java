package de.training.docker.blog.repository;

import de.training.docker.blog.repository.model.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<PostEntity, Long> {
    List<PostEntity> getAllPosts();
}