package com.example.stline.service.impl;

import com.example.stline.dto.MessageDTO;
import com.example.stline.mapper.MessageMapper;
import com.example.stline.repository.MessageRepository;
import com.example.stline.service.MessageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class MessageServiceImpl implements MessageService {

    private final MessageRepository repository;
    private final MessageMapper mapper;

    @Override
    public boolean create(MessageDTO messageDTO) {
        return repository.create(mapper.toEntity(messageDTO));
    }

    @Override
    public boolean remove(Long id) {
        return repository.remove(id);
    }


    @Override
    public List<MessageDTO> getAll() {
        return repository.getAll().stream().map(mapper::toDto).collect(Collectors.toList());
    }

}
