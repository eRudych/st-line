package com.example.stline.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;

@AllArgsConstructor
@Data
public class MessageDTO implements BaseDTO {
    private  String name;
    private  String phone;
    private  String message;
    private Timestamp date;
}
