package com.example.stline.service;

import com.example.stline.dto.ProductDTO;
import com.example.stline.entity.Category;
import com.example.stline.entity.Mark;
import com.example.stline.entity.Product;

import java.util.List;

public interface ProductService extends BaseService {

    Product create(ProductDTO productDTO);

    Product update(Product product);

    boolean remove(Long id);

    Product get(Long id);

    List getAll();

    List searchProducts(ProductDTO post);

    Category createCategory(String name);

    List<Category> getAllCategories();

    Mark createMark(String name);

    List<Mark> getAllMarks();
}
