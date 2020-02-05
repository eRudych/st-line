package com.example.stline.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Mark implements BaseEntity{
    private Long id;
    private String name;
}
