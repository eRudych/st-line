package com.example.stline.controller;

import com.example.stline.factory.controller.ControllerFactory;
import com.example.stline.factory.controller.ControllerType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/st-line/{controller}")
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class MainController {
    private final ControllerFactory controllerFactory;

    @GetMapping
    public BaseController getController(@PathVariable("controller") ControllerType controllerType) {
        log.info("");
        return controllerFactory.getController(controllerType);
    }
}
