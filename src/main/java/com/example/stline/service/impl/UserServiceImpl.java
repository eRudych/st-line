package com.example.stline.service.impl;

import com.example.stline.dto.UserDTO;
import com.example.stline.mapper.UserMapper;
import com.example.stline.repository.UserRepository;
import com.example.stline.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final UserMapper mapper;

    @Override
    @Transactional
    public boolean remove(Long id) {
        return repository.remove(id);
    }

    @Override
    @Transactional
    public UserDTO create(UserDTO post) {
        return mapper.toDto(repository.create(mapper.toEntity(post)));
    }

    @Override
    @Transactional
    public boolean update(UserDTO post) {
        return repository.update(mapper.toEntity(post));
    }

    @Override
    public UserDTO get(Long id) {
        return mapper.toDto(repository.get(id));
    }

    @Override
    public List<UserDTO> getAll() {
        return repository.getAll().stream().map(mapper::toDto).collect(Collectors.toList());
    }
}
