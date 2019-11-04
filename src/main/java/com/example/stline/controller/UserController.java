package com.example.stline.controller;

import com.example.stline.dto.UserDTO;
import com.example.stline.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "st-line/users/")
@RequiredArgsConstructor()
@Slf4j
public class UserController {

    private final UserService service;

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public UserDTO create(@RequestBody UserDTO userDTO) {
        log.info("");
        return service.create(userDTO);
    }

    @GetMapping("/{id}")
    public UserDTO get(@PathVariable("id") long id) {
        return service.get(id);
    }

    @PutMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public UserDTO update(@RequestBody UserDTO userDTO) {
        return service.update(userDTO);
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
