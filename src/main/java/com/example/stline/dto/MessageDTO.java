package com.example.stline.dto;

import lombok.Data;

@Data
public class MessageDTO implements BaseDTO {
    private  Long id;
    private  String name;
    private  String phone;
    private  String message;
}
