package com.example.stline.service;

import com.example.stline.dto.MessageDTO;
import com.example.stline.factory.service.ServiceType;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements BaseService {
    @Override
    public ServiceType getType() {
        return ServiceType.POST;
    }

    @Override
    public MessageDTO send(MessageDTO messageDTO) {
        return null;
    }
}
