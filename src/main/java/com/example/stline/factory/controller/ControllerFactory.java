package com.example.stline.factory.controller;

import com.example.stline.controller.BaseController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Slf4j
@Component
public class ControllerFactory {
    private final Map<ControllerType, BaseController> mapping;

    @Autowired
    public ControllerFactory(List<BaseController> controllers) {
        this.mapping = controllers.stream().collect(Collectors.toMap(BaseController::getType, Function.identity()));
    }

    public BaseController getController(ControllerType type) {
        log.info("");
        return mapping.computeIfAbsent(type, key ->
        {
            log.error("");
            throw new IllegalArgumentException("");
        });

    }
}
