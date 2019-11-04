package com.example.stline.entity;

import lombok.Value;

@Value
public class User {
    private final Long id;
    private final String login;
    private final String password;
}
