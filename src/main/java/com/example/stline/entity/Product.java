package com.example.stline.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product implements BaseEntity{
    private Long id;
    private String mark;
    private String model;
    private String range;
    private String category;
    private String years;
    private String price;
    private String info;
    private String photo1;
    private String photo2;
    private String photo3;
}
