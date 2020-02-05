package com.example.stline.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.springframework.security.core.Authentication;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User implements BaseEntity {
    private Long id;
    private String userName;
    private String email;
    private String password;
    private Long role;
}
