package com.example.stline.controller;

import com.example.stline.dto.PostDTO;
import com.example.stline.entity.Post;
import com.example.stline.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/st-line/posts")
@RequiredArgsConstructor
@Slf4j
public class PostController {

    private final PostService service;

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public Post create(@RequestBody PostDTO postDTO) {
        log.info("create post"+ postDTO.toString());
        return service.create(postDTO);
    }

    @GetMapping("/{id}")
    public Post get(@PathVariable("id") long id) {
        return service.get(id);
    }

    @PutMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public Post update(@RequestBody Post post) {
        return service.update(post);
    }

    @DeleteMapping("/{id}")
    public boolean remove(@PathVariable("id") long id) {
        log.info("remove post");
        return service.remove(id);
    }

    @GetMapping
    public List getAll() {
        return service.getAll();
    }
}