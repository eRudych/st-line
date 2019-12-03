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
        mapping.put("news", "post/posts");

        //import
        mapping.put("/header", "import/header");
        mapping.put("/footer", "import/footer");
        mapping.put("/appStyle", "import/appStyle");
        mapping.put("/messageForm", "import/messageForm");

        //post
        mapping.put("createPost", "post/create");
        mapping.put("test", "post/test");
        mapping.put("editPost", "post/edit");
        mapping.put("post", "post/get");
//        mapping.put("getPost/{id}", "post/get");

        mapping.put("send", "message/sendMessage");
        mapping.put("messages", "message/listMessage");
    }

    @GetMapping
    public String getPage(@PathVariable("pageName") String pageName){
        log.info("return page "+pageName);
        return mapping.getOrDefault(pageName,"error");
    }

}
