package com.example.stline.entity;

import lombok.Value;

@Value
public class Product implements BaseEntity{
    private final Long id;
    private final String product;
}
