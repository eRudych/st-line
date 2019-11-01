package com.example.stline.factory.service;

import com.example.stline.service.BaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Slf4j
@Component
public class ServiceFactory {
    private final Map<ServiceType, BaseService> mapping;

    @Autowired
    public ServiceFactory(List<BaseService> services) {
        this.mapping = services.stream().collect(Collectors.toMap(BaseService::getType, Function.identity()));
    }

    public BaseService getService(ServiceType type) {
        log.info("");
        return mapping.computeIfAbsent(type, key ->
        {
            log.error("");
            throw new IllegalArgumentException("");
        });

    }
}
