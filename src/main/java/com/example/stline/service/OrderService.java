package com.example.stline.service;

import com.example.stline.dto.OrderDTO;
import com.example.stline.entity.Order;

import java.util.List;

public interface OrderService extends BaseService {

    Order create(OrderDTO order);

    boolean delete(long orderId);

    boolean close(long orderId);

    boolean addProduct(long orderId, long productId);

    boolean deleteProduct(long orderId, long id);

    List getAllProducts(long orderId);

    boolean deleteAllProducts(long orderId);

    Order createOrderForUser(Long userId);
}
