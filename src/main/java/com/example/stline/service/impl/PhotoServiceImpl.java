package com.example.stline.service.impl;

import com.example.stline.dto.PhotoDTO;
import com.example.stline.entity.Product;
import com.example.stline.mapper.PhotoMapper;
import com.example.stline.repository.PhotoRepository;
import com.example.stline.service.PhotoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class PhotoServiceImpl implements PhotoService {

    private final PhotoRepository repository;
    private final PhotoMapper mapper;

    @Override
    public List<PhotoDTO> getAll(Product product) {
        return repository.getAll(product).stream().map(mapper::toDto).collect(Collectors.toList());
    }
}
