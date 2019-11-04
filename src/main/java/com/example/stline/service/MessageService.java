package com.example.stline.service;

import com.example.stline.dto.BaseDTO;
import com.example.stline.dto.MessageDTO;

import java.util.List;

public interface MessageService extends BaseService{

    boolean create(MessageDTO dto);

    boolean remove(Long id);

    List<MessageDTO> getAll();
}

