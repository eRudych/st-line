package com.example.stline.repository;

public interface BotRepository extends BaseRepository {

    boolean create(Integer id, Long postId);

    boolean remove(Long postId);

    Integer get(Long postId);
    
}
