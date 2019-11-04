package com.example.stline.dto;

import com.example.stline.entity.Photo;
import com.example.stline.entity.Product;
import lombok.Data;

@Data
public class PhotoDTO implements BaseDTO {
    private Long id;
    private Product product;
    private String model;
    private String brand;
}
