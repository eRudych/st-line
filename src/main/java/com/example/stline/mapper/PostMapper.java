package com.example.stline.mapper;

import com.example.stline.dto.PostDTO;
import com.example.stline.entity.Post;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Slf4j
@Component
@RequiredArgsConstructor
public class PostMapper implements Mapper<Post, PostDTO> {

    private final ModelMapper mapper;

    @Override
    public Post toEntity(PostDTO dto) {
        log.info("Mapper - toEntity");
        return Objects.isNull(dto) ? null : mapper.map(dto, Post.class);
    }

    @Override
    public PostDTO toDto(Post entity) {
        log.info("Mapper - toDto");
        return Objects.isNull(entity) ? null : mapper.map(entity, PostDTO.class);
    }
}
