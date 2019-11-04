package com.example.stline.entity;

import lombok.Value;

@Value
public class Photo implements BaseEntity{
    private final Long id;
    private final Product product;
    private final String model;
    private final String brand;
}