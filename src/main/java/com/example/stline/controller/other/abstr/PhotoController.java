package com.example.stline.controller.other.abstr;

import com.example.stline.controller.AbstractController;
import com.example.stline.factory.controller.ControllerType;
import com.example.stline.factory.service.ServiceFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "st-line/photos/")
@Slf4j
public class PhotoController extends AbstractController {
    public PhotoController(ServiceFactory serviceFactory) {
        super(serviceFactory);
    }

    @Override
    public ControllerType getType() {
        return ControllerType.PHOTO;
    }
}
