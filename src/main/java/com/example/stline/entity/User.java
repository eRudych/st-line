package com.example.stline.entity;

import lombok.Value;

@Value
public class User implements BaseEntity {
    private final Long id;
    private final String name;
    private final String login;
    private final String password;
    private final UserRole role;
}
