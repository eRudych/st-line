package com.example.stline.mapper;

import com.example.stline.dto.MessageDTO;
import com.example.stline.entity.Message;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Slf4j
@Component
@RequiredArgsConstructor
public class MessageMapper implements Mapper<Message,MessageDTO> {

    private final ModelMapper mapper;

    @Override
    public Message toEntity(MessageDTO dto) {
        log.info("Mapper - toEntity");
        return Objects.isNull(dto) ? null : mapper.map(dto, Message.class);
    }

    @Override
    public MessageDTO toDto(Message entity) {
        log.info("Mapper - toDto");
        return Objects.isNull(entity) ? null : mapper.map(entity, MessageDTO.class);
    }


}
