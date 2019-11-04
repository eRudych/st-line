package com.example.stline.mapper;

import com.example.stline.dto.UserDTO;
import com.example.stline.entity.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Slf4j
@Component
@RequiredArgsConstructor
public class UserMapper implements Mapper<User, UserDTO> {

    private final ModelMapper mapper;

    @Override
    public User toEntity(UserDTO dto) {
        log.info("Mapper - toEntity");
        return Objects.isNull(dto) ? null : mapper.map(dto, User.class);
    }

    @Override
    public UserDTO toDto(User entity) {
        log.info("Mapper - toDto");
        return Objects.isNull(entity) ? null : mapper.map(entity, UserDTO.class);
    }
}
