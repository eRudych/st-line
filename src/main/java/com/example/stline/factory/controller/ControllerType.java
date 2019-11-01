package com.example.stline.factory.controller;

public enum ControllerType {
    MESSAGE("message"), POST("post"), PHOTO("photo"), PAGE("page");

    private String type;

    ControllerType(String type) {
        this.type=type;
    }

    public String type() {
        return type;
    }
}
