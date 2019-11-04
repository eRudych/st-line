package com.example.stline.controller;

import com.example.stline.dto.MessageDTO;
import com.example.stline.entity.Message;
import com.example.stline.mapper.MessageMapper;
import com.example.stline.service.BaseService;
import com.example.stline.service.MessageServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "st-line/messages/")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class MessageController {

   // @Qualifier("messageServiceImpl")
    private final MessageServiceImpl  service;
    private final MessageMapper mapper;

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public MessageDTO send(@RequestBody MessageDTO messageDTO){
        return service.send(mapper.toEntity(messageDTO));
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