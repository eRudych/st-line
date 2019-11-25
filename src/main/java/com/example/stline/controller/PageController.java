package com.example.stline.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping({"st-line/{pageName}"})
@Slf4j
public class PageController {

    private Map<String,String> mapping;

    @PostConstruct
    private void init() {
        mapping = new HashMap<>();

        mapping.put("index", "index");
        //main pages
        mapping.put("main", "main");
        mapping.put("about", "about");
        mapping.put("products", "products");
        mapping.put("news", "html/post/posts");

        //import
        mapping.put("/header", "html/import/header");
        mapping.put("/footer", "html/import/footer");
        mapping.put("/appStyle", "html/import/appStyle");
        mapping.put("/messageForm", "html/import/messageForm");

        //post
        mapping.put("createPost", "html/post/create");
        mapping.put("test", "html/post/test");
        mapping.put("editPost", "html/post/edit");
        mapping.put("post", "html/post/get");
//        mapping.put("getPost/{id}", "html/post/get");

        mapping.put("send", "html/message/sendMessage");
        mapping.put("messages", "html/message/listMessage");
    }

    @GetMapping
    public String getPage(@PathVariable("pageName") String pageName){
        log.info("return page "+pageName);
        return mapping.getOrDefault(pageName,"error");
    }

}
