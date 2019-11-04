package com.example.stline.repository;

import com.example.stline.entity.Message;

import java.util.List;

public interface MessageRepository extends BaseRepository {

    boolean create(Message message);

    boolean remove(Long id);

    List<Message> getAll();
}
