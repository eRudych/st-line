package com.example.stline.service.impl;

import com.example.stline.dto.PostDTO;
import com.example.stline.mapper.PostMapper;
import com.example.stline.repository.PostRepository;
import com.example.stline.service.PostService;
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
public class PostServiceImpl implements PostService {

    private final PostRepository repository;
    private final PostMapper mapper;

    @Override
    @Transactional
    public PostDTO create(PostDTO post) {
        return mapper.toDto(repository.create(mapper.toEntity(post)));
    }

    @Override
    @Transactional
    public PostDTO update(PostDTO post) {
        if(repository.update(mapper.toEntity(post)))
            return mapper.toDto(repository.get(post.getId()));
        return null;
    }

    @Override
    public PostDTO get(Long id) {
        return mapper.toDto(repository.get(id));
    }

    @Override
    public List<PostDTO> getAll() {
        return repository.getAll().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @Override
    @Transactional
    public boolean remove(Long id) {
        return repository.remove(id);
    }
}
