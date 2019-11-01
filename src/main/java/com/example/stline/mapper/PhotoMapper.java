package com.example.stline.mapper;

import com.example.stline.dto.PhotoDTO;
import com.example.stline.entity.Photo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Slf4j
@Component
@RequiredArgsConstructor
public class PhotoMapper implements Mapper<Photo, PhotoDTO> {

    private final ModelMapper mapper;

    @Override
    public Photo toEntity(PhotoDTO dto) {
        log.info("Mapper - toEntity");
        return Objects.isNull(dto) ? null : mapper.map(dto, Photo.class);
    }

    @Override
    public PhotoDTO toDto(Photo entity) {
        log.info("Mapper - toDto");
        return Objects.isNull(entity) ? null : mapper.map(entity, PhotoDTO.class);
    }
}
