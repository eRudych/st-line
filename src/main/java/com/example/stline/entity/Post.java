package com.example.stline.entity;

import lombok.Getter;
import lombok.Value;

@Getter
@Value
public class Post implements BaseEntity{
    private final Long id;
    private final Long author;
    private final String title;
    private final String description;
    private final String text;
}