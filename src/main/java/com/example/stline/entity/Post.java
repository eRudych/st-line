package com.example.stline.entity;

import lombok.Value;

@Value
public class Post implements BaseEntity{
    private final Long id;
    private final Long author;
    private final String title;
    private final String description;
    private final String text;
}