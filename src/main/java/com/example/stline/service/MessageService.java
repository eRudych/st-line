package com.example.stline.service;

import com.example.stline.dto.MessageDTO;
import com.example.stline.entity.Message;

import java.util.List;

public interface MessageService extends BaseService{

    boolean create(MessageDTO dto);

    boolean remove(Long id);

    List<Message> getAll();
}

