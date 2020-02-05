package com.example.stline.controller;

import com.example.stline.dto.ProductDTO;
import com.example.stline.entity.Category;
import com.example.stline.entity.Mark;
import com.example.stline.entity.Product;
import com.example.stline.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("st-line/productsFun")
@RequiredArgsConstructor
@Slf4j
public class ProductsController {

    private final ProductService service;

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    Product create(@RequestBody ProductDTO productDTO) {
//        log.info(productDTO.toString());
        return service.create(productDTO);
    }

    @PutMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    Product update(@RequestBody Product product) {
        return service.update(product);
    }

    @DeleteMapping("/{id}")
    boolean remove(@PathVariable("id") long id) {
        return service.remove(id);
    }

    @GetMapping("/{id}")
    Product get(@PathVariable("id") long id) {
        return service.get(id);
    }

    @GetMapping
    List<Product> getAll() {
        return service.getAll();
    }

    @PostMapping(value = "/search",consumes = {MediaType.APPLICATION_JSON_VALUE})
    List searchProducts(@RequestBody ProductDTO productDTO) {
        return service.searchProducts(productDTO);
    }

    @PostMapping("/createCategory")
    Category createCategory(@RequestBody String name) {
        return service.createCategory(name);
    }

    @PostMapping("/createMark")
    Mark createMark(@RequestBody String name) {
        return service.createMark(name);
    }

    @GetMapping("/categories")
    List<Category> getAllCategories() {
        log.info("go");
        return service.getAllCategories();
    }

    @GetMapping("/marks")
    List<Mark> getAllMarks() {
        return service.getAllMarks();
    }
}
