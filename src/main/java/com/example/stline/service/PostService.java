package com.example.stline.service;

import com.example.stline.dto.PostDTO;

import java.util.List;


public interface PostService extends BaseService {

    PostDTO create(PostDTO post);

    PostDTO update(PostDTO post);

    PostDTO get(Long id);

    List<PostDTO> getAll();

    boolean remove(Long id);
}
