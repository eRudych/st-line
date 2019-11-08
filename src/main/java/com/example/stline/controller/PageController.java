package com.example.stline.controller;

import com.example.stline.dto.MessageDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("st-line/page/{pageName}")
@Slf4j
public class PageController {

    private Map<String,String> mapping;

    @PostConstruct
    private void init() {
        mapping = new HashMap<>();
        mapping.put("main", "main");
        mapping.put("about", "about");
        mapping.put("products", "products");
        mapping.put("news", "new");
        mapping.put("header", "html/import/header");
        mapping.put("footer", "html/import/footer");
        mapping.put("appStyle", "html/import/appStyle");
        mapping.put("links", "html/import/links");
        mapping.put("createPost", "html/post/create");
        mapping.put("getPost", "html/post/get");
        mapping.put("getListPost", "html/post/list");
        mapping.put("getListPost", "html/post/list");
        mapping.put("updatePost", "html/post/update");
     //   mapping.put("send", "static/views/sendMessage");

        mapping.put("send", "html/message/sendMessage");
        mapping.put("messages", "html/message/listMessage");
    }

    @GetMapping
    public String getPage(@PathVariable("pageName") String pageName){
        log.info("return page "+pageName);
        return mapping.getOrDefault(pageName,"error");
    }

//    @GetMapping()
//    public ModelAndView showForm() {
//        return new ModelAndView("employeeHome", "employee", new MessageDTO());
//    }

//    @RequestMapping(value = "/employee", method = RequestMethod.GET)
//    public ModelAndView showForm() {
//        return new ModelAndView("main", "employee", new MessageDTO());
//    }
//
//    @RequestMapping(value = "/st-line/messages", method = RequestMethod.POST)
//    public String submit(@ModelAttribute("message")MessageDTO employee,
//                         BindingResult result, ModelMap model) {
//        if (result.hasErrors()) {
//            return "error";
//        }
//        model.addAttribute("name", employee.getName());
//        model.addAttribute("contactNumber", employee.getPhone());
//        model.addAttribute("message",employee.getMessage());
//        model.addAttribute("id", employee.getId());
//        return "main11";
//    }
}
