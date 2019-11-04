package com.example.stline.service;

import com.example.stline.dto.BaseDTO;
import com.example.stline.dto.MessageDTO;
import com.example.stline.entity.BaseEntity;
import com.example.stline.entity.Message;
import com.example.stline.factory.service.ServiceType;

public interface BaseService {

    ServiceType getType();
   // <T extends BaseDTO, E extends BaseEntity> T send(E entity);

}
