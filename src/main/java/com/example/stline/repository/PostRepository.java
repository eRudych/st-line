package com.example.stline.repository;

import com.example.stline.entity.Post;

import java.util.List;

public interface PostRepository extends BaseRepository {
    Post create(Post post);

    boolean update(Post post);

    Post get(Long id);

    List<Post> getAll();

    boolean remove(Long id);
}
