package com.example.stline.entity;

import lombok.*;

import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Post implements BaseEntity{
    private Long id;
    private String title;
    private String description;
    private String text;

    private Timestamp date;
}