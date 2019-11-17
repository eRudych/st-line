package com.example.stline.dto;

import lombok.Data;

@Data
public class PostDTO implements BaseDTO {
    private  String title;
    private  String description;
    private  String text;
}
