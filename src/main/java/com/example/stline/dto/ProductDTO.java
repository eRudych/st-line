package com.example.stline.dto;

import lombok.Data;

@Data
public class ProductDTO implements BaseDTO {
    private Long id;
    private String product;
}
