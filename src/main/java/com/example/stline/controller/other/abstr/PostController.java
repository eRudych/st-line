package com.example.stline.controller.other.abstr;

import com.example.stline.controller.AbstractController;
import com.example.stline.factory.controller.ControllerType;
import com.example.stline.factory.service.ServiceFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "st-line/news/")
@Slf4j
public class PostController extends AbstractController {

    public PostController(ServiceFactory serviceFactory) {
        super(serviceFactory);
    }

    @Override
    public ControllerType getType() {
        return ControllerType.POST;
    }
}
