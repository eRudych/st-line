package com.example.stline.controller;

import com.example.stline.dto.PostDTO;
import com.example.stline.mapper.PostMapper;
import com.example.stline.service.PostServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "st-line/posts/")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class PostController {

    private final PostServiceImpl service;
    private final PostMapper mapper;
    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public PostDTO create(@RequestBody PostDTO PostDTO) {
        log.info("");
        return service.create(mapper.toEntity(PostDTO));
    }

    @GetMapping("/{id}")
    public PostDTO get(@PathVariable("id") long id) {
        return service.get(id);
    }

    @PutMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public PostDTO update(@RequestBody PostDTO PostDTO) {
        return service.update(mapper.toEntity(PostDTO));
    }

    @DeleteMapping("/{id}")
    public boolean remove(@PathVariable("id") long id) {
        return service.remove(id);
    }

    @GetMapping
    public List getAll() {
        return service.getAll();
    }
}