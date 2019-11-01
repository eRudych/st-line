package com.example.stline.controller;

import com.example.stline.dto.PhotoDTO;
import com.example.stline.mapper.PhotoMapper;
import com.example.stline.service.PhotoServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "st-line/photos/")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class PhotoController {

    private final PhotoServiceImpl service;
    private final PhotoMapper mapper;

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public List getPhotos(@RequestBody PhotoDTO photoDTO){
        return service.getPhotos(mapper.toEntity(photoDTO));
    }
}
