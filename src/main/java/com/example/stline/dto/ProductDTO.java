package com.example.stline.dto;

import lombok.Data;

@Data
public class ProductDTO implements BaseDTO {
    private Long id;
    private Long mark;
    private String model;
    private String range;
    private Long category;
    private String years;
    private String price;
    private String info;
    private String photo1;
    private String photo2;
    private String photo3;
}
