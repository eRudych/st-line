package com.example.stline.mapper;

import com.example.stline.dto.BaseDTO;
import com.example.stline.entity.BaseEntity;

public interface Mapper<Entity extends BaseEntity, DTO extends BaseDTO> {

    Entity toEntity(DTO dto);

    DTO toDto(Entity entity);
}
