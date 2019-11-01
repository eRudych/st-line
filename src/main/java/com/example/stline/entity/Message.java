package com.example.stline.entity;

import lombok.Value;

@Value
public class Message implements BaseEntity {
    private final Long id;
    private final String name;
    private final String phone;
    private final String message;
}
