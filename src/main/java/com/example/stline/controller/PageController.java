package com.example.stline.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "st-line/page/{pageName}")
@Slf4j
public class PageController {

    private final Map<String,String> mapping;

    public PageController() {
        mapping = new HashMap<>();
        mapping.put("main","mainPage");
        mapping.put("about","aboutUsPage");
        mapping.put("products","productsPage");
    }

    @GetMapping
    public String getPage(@PathVariable("pageName") String pageName){
        return pageName;
    }
}
