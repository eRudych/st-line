package com.example.stline.dto;

import lombok.Data;

@Data
public class CustomerDTO implements BaseDTO {
    private String phoneNumber;
    private String email;
    private String name;
}
