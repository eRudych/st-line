package com.example.stline.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Photo implements BaseEntity{
    private Long id;
    private Product product;
    private String model;
    private String brand;
}