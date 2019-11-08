package com.example.stline.dto;

import lombok.Data;

@Data
public class PostDTO implements BaseDTO {
    private  Long id;
 //   private  Long author;
    private  String title;
    private  String description;
    private  String text;
}
