package com.example.stline.controller.other.abstr;

import com.example.stline.controller.AbstractController;
import com.example.stline.dto.MessageDTO;
import com.example.stline.entity.Message;
import com.example.stline.factory.controller.ControllerType;
import com.example.stline.factory.service.ServiceFactory;
import com.example.stline.factory.service.ServiceType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "st-line/messages/")
@Slf4j
public class MessageController extends AbstractController {

    public MessageController(ServiceFactory serviceFactory) {
        super(serviceFactory);
    }

    @Override
    public ControllerType getType() {
        return ControllerType.MESSAGE;
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public MessageDTO send(@RequestBody MessageDTO messageDTO){
         return getService(ServiceType.MESSAGE).send(messageDTO);
    }

}
