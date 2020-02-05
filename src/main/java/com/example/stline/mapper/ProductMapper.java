package com.example.stline.mapper;

import com.example.stline.dto.ProductDTO;
import com.example.stline.entity.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Slf4j
@Component
@RequiredArgsConstructor
public class ProductMapper implements Mapper<Product, ProductDTO> {

    private final ModelMapper mapper;

    @Override
    public Product toEntity(ProductDTO dto) {
        log.info("Mapper - toEntity");
        return Objects.isNull(dto) ? null : mapper.map(dto, Product.class);
    }

    @Override
    public ProductDTO toDto(Product entity) {
        log.info("Mapper - toDto");
        return Objects.isNull(entity) ? null : mapper.map(entity, ProductDTO.class);
    }
}
