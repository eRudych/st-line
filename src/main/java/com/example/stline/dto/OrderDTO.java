package com.example.stline.dto;

import com.example.stline.entity.Customer;
import com.example.stline.entity.Product;
import lombok.Data;

import java.security.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;

@Data
public class OrderDTO implements BaseDTO {
    private Long idUser;
    private String phone;
    private String address;
    private String description;
    private boolean action;
    private Timestamp create_at;
    private Timestamp close_at;
}
