package com.example.stline.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer implements BaseEntity {
    private Long id;
    private String phoneNumber;
    private String email;
    private String name;
}
