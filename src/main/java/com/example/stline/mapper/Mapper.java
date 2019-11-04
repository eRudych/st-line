package com.example.stline.mapper;

import com.example.stline.dto.BaseDTO;
import com.example.stline.dto.MessageDTO;
import com.example.stline.entity.BaseEntity;
import com.example.stline.entity.Message;

public interface Mapper<Entity extends BaseEntity, DTO extends BaseDTO> {

    Entity toEntity(DTO dto);

    DTO toDto(Entity entity);
}