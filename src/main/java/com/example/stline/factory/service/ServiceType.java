package com.example.stline.factory.service;

public enum ServiceType {
    MESSAGE("message"), POST("post"), PHOTO("photo");

    private String type;
    ServiceType(String type) {
        this.type=type;
    }

    public String type() {
        return type;
    }
}
