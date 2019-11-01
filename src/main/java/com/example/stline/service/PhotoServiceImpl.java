package com.example.stline.service;

import com.example.stline.dto.MessageDTO;
import com.example.stline.factory.service.ServiceType;

public class PhotoServiceImpl implements BaseService {
    @Override
    public ServiceType getType() {
        return ServiceType.PHOTO;
    }

    @Override
    public MessageDTO send(MessageDTO messageDTO) {
        return null;
    }
}
