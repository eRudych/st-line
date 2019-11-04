package com.example.stline.service;

import com.example.stline.dto.BaseDTO;
import com.example.stline.dto.MessageDTO;
import com.example.stline.entity.BaseEntity;
import com.example.stline.entity.Message;
import com.example.stline.factory.service.ServiceType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements BaseService {
    @Override
    public ServiceType getType() {
        return ServiceType.MESSAGE;
    }

    //@Override
    public MessageDTO send(Message message) {
        return null;
    }

    public boolean remove(long id) {
        return false;
    }

    public List getAll() {
        return null;
    }
}
