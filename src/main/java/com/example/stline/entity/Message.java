package com.example.stline.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Message implements BaseEntity {
    private Long id;
    private String name;
    private String phone;
    private String message;
    private Timestamp date;
}