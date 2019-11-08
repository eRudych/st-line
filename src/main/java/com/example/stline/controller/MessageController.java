package com.example.stline.controller;

import com.example.stline.dto.MessageDTO;
import com.example.stline.service.MessageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/st-line")
@RequiredArgsConstructor
@Slf4j
public class MessageController {

    private final MessageService service;

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public boolean send(@RequestBody MessageDTO messageDTO){
        return service.create(messageDTO);
    }

    @DeleteMapping("/{id}")
    public boolean remove(@PathVariable("id") long id){
        return service.remove(id);
    }

    @GetMapping
    public List getAll(){
        return service.getAll();
    }
}