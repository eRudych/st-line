package com.example.stline.controller;

import com.example.stline.dto.PostDTO;
import com.example.stline.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/st-line/posts")
@RequiredArgsConstructor
@Slf4j
public class PostController {

    private final PostService service;

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public PostDTO create(@RequestBody PostDTO postDTO) {
        log.info("");
        return service.create(postDTO);
    }

    @GetMapping("/{id}")
    public PostDTO get(@PathVariable("id") long id) {
        return service.get(id);
    }

    @PutMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public PostDTO update(@RequestBody PostDTO postDTO) {
        return service.update(postDTO);
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