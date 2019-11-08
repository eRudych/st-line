package com.example.stline.controller;

import com.example.stline.dto.PhotoDTO;
import com.example.stline.service.PhotoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/st-line/photos")
@RequiredArgsConstructor
@Slf4j
public class PhotoController {

    private final PhotoService service;

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public List getPhotos(@RequestBody PhotoDTO photoDTO){
        return service.getAll(photoDTO.getProduct());
    }
}
