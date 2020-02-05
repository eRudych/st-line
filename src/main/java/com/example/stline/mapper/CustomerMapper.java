package com.example.stline.mapper;

import com.example.stline.dto.CustomerDTO;
import com.example.stline.entity.Customer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Slf4j
@Component
@RequiredArgsConstructor
public class CustomerMapper implements Mapper<Customer, CustomerDTO>{

    private final ModelMapper mapper;

    @Override
    public Customer toEntity(CustomerDTO dto) {
        return Objects.isNull(dto) ? null : mapper.map(dto, Customer.class);
    }

    @Override
    public CustomerDTO toDto(Customer entity) {
        return Objects.isNull(entity) ? null : mapper.map(entity, CustomerDTO.class);
    }
}
