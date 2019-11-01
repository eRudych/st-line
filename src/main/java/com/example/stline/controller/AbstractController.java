package com.example.stline.controller;

import com.example.stline.factory.controller.ControllerType;
import com.example.stline.factory.service.ServiceFactory;
import com.example.stline.factory.service.ServiceType;
import com.example.stline.service.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public abstract class AbstractController implements BaseController {

    private final ServiceFactory serviceFactory;
    public abstract ControllerType getType();

    protected BaseService getService(ServiceType type){
        return serviceFactory.getService(type);
    }
}
