package com.example.stline.mapper;

import com.example.stline.dto.OrderDTO;
import com.example.stline.entity.Order;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Slf4j
@Component
@RequiredArgsConstructor
public class OrderMapper implements Mapper<Order, OrderDTO> {

    private final ModelMapper mapper;

    @Override
    public Order toEntity(OrderDTO dto) {
        return Objects.isNull(dto) ? null : mapper.map(dto, Order.class);
    }

    @Override
    public OrderDTO toDto(Order entity) {
        return Objects.isNull(entity) ? null : mapper.map(entity, OrderDTO.class);
    }
}
