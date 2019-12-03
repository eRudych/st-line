package com.example.stline.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class PostDTO implements BaseDTO {
    private  String title;
    private  String description;
    private  String text;
    private Timestamp date;
    private boolean isSendPostIntoChannel;
}
