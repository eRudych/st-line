package com.example.stline.service;

import com.example.stline.dto.PostDTO;
import com.example.stline.entity.Post;

import java.util.List;


public interface PostService extends BaseService {

    Post create(PostDTO post);

    Post update(Post post);

    Post get(Long id);

    List<Post> getAll();

    boolean remove(Long id);
}
