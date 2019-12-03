package com.example.stline.service;

import com.example.stline.dto.PostDTO;
import com.example.stline.entity.Post;

public interface BotService  extends BaseService{

    boolean sendPost(PostDTO postDTO, Long id);

    boolean editPost(Post post);

    boolean removePost(Long id);
}
