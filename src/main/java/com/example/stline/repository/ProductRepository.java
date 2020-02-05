package com.example.stline.repository;

import com.example.stline.entity.BaseEntity;
import com.example.stline.entity.Category;
import com.example.stline.entity.Mark;
import com.example.stline.entity.Product;

import java.util.List;

public interface ProductRepository extends BaseEntity {

    Product create(Product product);

    boolean update(Product product);

    boolean remove(Long id);

    Product get(Long id);

    List<Product> getAll();

    List<Product> searchProducts(Product product);

    Category createCategory(String name);

    List getAllCategories();

    Mark createMark(String name);

    List getAllMarks();
}
