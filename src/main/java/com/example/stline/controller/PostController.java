package com.example.stline.controller;

import com.example.stline.dto.PostDTO;
import com.example.stline.entity.Post;
import com.example.stline.service.BotService;
import com.example.stline.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("st-line/posts")
@RequiredArgsConstructor
@Slf4j
public class PostController {

    private final PostService webService;
    private final BotService botService;

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public Post create(@RequestBody PostDTO post) {
        Post postResult = webService.create(post);
        if (post.isSendPostIntoChannel()) {
            botService.sendPost(post,postResult.getId());
        }
        botService.sendPost(post,postResult.getId());
        return postResult;
    }

    @GetMapping("/{id}")
    public Post get(@PathVariable("id") long id) {
        return webService.get(id);
    }

    @PutMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public Post update(@RequestBody Post post) {
        botService.editPost(post);
        return webService.update(post);
    }

    @DeleteMapping("/{id}")
    public boolean remove(@PathVariable("id") long id) {
        botService.removePost(id);
        return webService.remove(id);
    }

    @GetMapping
    public List getAll() {
        return webService.getAll();
    }
}