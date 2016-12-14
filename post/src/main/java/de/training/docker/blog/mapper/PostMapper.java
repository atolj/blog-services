package de.training.docker.blog.mapper;

import de.training.docker.blog.domain.Post;
import de.training.docker.blog.repository.model.PostEntity;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PostMapper {

    private AuthorMapper authorMapper;

    public Post map(PostEntity postEntity) {
        return Post.builder()
                .headline(postEntity.getHeadline())
                .content(postEntity.getContent())
                .postedOn(postEntity.getPostedOn())
                .author(authorMapper.map(postEntity.getAuthor()))
                .build();
    }

    public PostEntity mapToEntity(long id, Post post) {
        PostEntity postEntity = new PostEntity();
        postEntity.setId(id);
        postEntity.setAuthor(authorMapper.map(post.getAuthor()));
        postEntity.setHeadline(post.getHeadline());
        postEntity.setContent(post.getContent());
        postEntity.setPostedOn(post.getPostedOn());
        return postEntity;
    }
}
