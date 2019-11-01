package com.example.stline.dto;

import lombok.Data;

@Data
public class PhotoDTO implements BaseDTO {
    private Long id;
    private Long product;
    private String model;
    private String brand;
}
