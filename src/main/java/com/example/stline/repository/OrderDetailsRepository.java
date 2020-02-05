package com.example.stline.repository;

import com.example.stline.entity.Order;

import java.util.List;

public interface OrderDetailsRepository extends BaseRepository {

    boolean addProduct(long orderId, long productId);
    boolean deleteProduct(long orderId, long id);
    List getAllProducts(long orderId);
    boolean deleteAllProducts(long orderId);
}
