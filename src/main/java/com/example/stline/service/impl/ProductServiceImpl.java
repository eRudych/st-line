package com.example.stline.service.impl;

import com.example.stline.dto.ProductDTO;
import com.example.stline.entity.Category;
import com.example.stline.entity.Mark;
import com.example.stline.entity.Product;
import com.example.stline.mapper.ProductMapper;
import com.example.stline.repository.ProductRepository;
import com.example.stline.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;
    private final ProductMapper mapper;

    @Override
    public Product create(ProductDTO productDTO) {
        return repository.create(mapper.toEntity(productDTO));
    }

    @Override
    public Product update(Product product) {
        if(repository.update(product))
            return get(product.getId());
        return null;
    }

    @Override
    public boolean remove(Long id) { return repository.remove(id); }

    @Override
    public Product get(Long id) { return repository.get(id); }

    @Override
    public List<Product> getAll() {
        return repository.getAll();
    }

    @Override
    public List<Product> searchProducts(ProductDTO productDTO) {
        return repository.searchProducts(mapper.toEntity(productDTO));
    }

    @Override
    public Category createCategory(String name) {
        return repository.createCategory(name);
    }

    @Override
    public List<Category> getAllCategories() {
        log.info("go..." );
        return repository.getAllCategories();
    }

    @Override
    public Mark createMark(String name) {
        return repository.createMark(name);
    }

    @Override
    public List<Mark> getAllMarks() {
        return repository.getAllMarks();
    }
}
