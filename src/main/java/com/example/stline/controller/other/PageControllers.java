package com.example.stline.controller.other;

import com.example.stline.controller.BaseController;
import com.example.stline.factory.controller.ControllerType;
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
public class PageControllers implements BaseController {

    private final Map<String,String> mapping;

    public PageControllers() {
        mapping = new HashMap<>();
        mapping.put("main","mainPage");
        mapping.put("about","aboutUsPage");
        mapping.put("products","productsPage");
    }

    @Override
    public ControllerType getType() {
        return ControllerType.PAGE;
    }

    @GetMapping
    public String getPage(@PathVariable("pageName") String pageName){
        return pageName;
    }
}
