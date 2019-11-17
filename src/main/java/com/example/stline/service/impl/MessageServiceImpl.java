package com.example.stline.service.impl;

import com.example.stline.dto.MessageDTO;
import com.example.stline.entity.Message;
import com.example.stline.mapper.MessageMapper;
import com.example.stline.repository.MessageRepository;
import com.example.stline.service.MessageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class MessageServiceImpl implements MessageService {

    private final MessageRepository repository;
    private final MessageMapper mapper;

    @Override
    @Transactional
    public boolean create(MessageDTO messageDTO) {
        log.info("create message "+ messageDTO.toString());
        return repository.create(mapper.toEntity(messageDTO));
    }

    @Override
    @Transactional
    public boolean remove(Long id) {
        return repository.remove(id);
    }

    @Override
    public List<Message> getAll() {
        return repository.getAll();
    }

}
