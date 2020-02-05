package com.example.stline.controller;

import com.example.stline.dto.OrderDTO;
import com.example.stline.entity.Order;
import com.example.stline.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("st-line/orders")
@RequiredArgsConstructor
@Slf4j
public class OrderController {

    private final OrderService service;

    @PostMapping
    (consumes = {MediaType.APPLICATION_JSON_VALUE})
    public Order create(Long userId) {
        System.out.println(userId);
        log.info(userId.toString());
        return service.createOrderForUser(userId);
    }

    @DeleteMapping
    public boolean delete(@RequestBody long id) {
        return service.delete(id);
    }

//    @PostMapping(value = "/product", consumes = {MediaType.APPLICATION_JSON_VALUE})
//    public Order addProduct(@RequestBody long id) {
//        return service.addProduct(id);
//    }
//

//    @DeleteMapping("/product")
//    public boolean deleteProduct(@RequestBody long id) {
//        return service.deleteProduct(id);id
//    }
//
//    @GetMapping("/products")
//    public List getAllProducts() {
//        return service.getAllProducts();
//    }
//
//    @DeleteMapping("/products")
//    public boolean deleteAllProducts() {
//        return service.deleteAllProducts();
//    }
}
