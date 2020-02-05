package com.example.stline.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Category implements BaseEntity{
    private Long id;
    private String name;
}
