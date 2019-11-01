package com.example.stline.service;

import com.example.stline.dto.MessageDTO;
import com.example.stline.factory.service.ServiceType;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements BaseService {
    @Override
    public ServiceType getType() {
        return ServiceType.MESSAGE;
    }

    @Override
    public MessageDTO send(MessageDTO messageDTO){
        return null;
    }
}
