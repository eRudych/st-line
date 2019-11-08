package com.example.stline.dto;

import com.example.stline.entity.UserRole;
import lombok.Data;

@Data
public class UserDTO implements BaseDTO {
    private Long id;
    private String name;
    private String login;
    private String password;
    private  UserRole role;

}
