package com.example.stline.service.impl;

import com.example.stline.dto.OrderDTO;
import com.example.stline.entity.Order;

import com.example.stline.mapper.OrderMapper;
import com.example.stline.repository.OrderDetailsRepository;
import com.example.stline.repository.OrderRepository;
import com.example.stline.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final OrderDetailsRepository detailsRepository;
    private final OrderMapper mapper;

    @Override
    public Order create(OrderDTO orderDTO) {
         return orderRepository.create(mapper.toEntity(orderDTO));
    }

    @Override
    public boolean delete(long id) {
        return orderRepository.delete(id);
    }

    @Override
    public boolean close(long id) {
        return orderRepository.close(id);
    }

    @Override
    public boolean addProduct(long orderId, long productId) {
        return detailsRepository.addProduct(orderId,productId);
    }

    @Override
    public boolean deleteProduct(long orderId, long productId) {
        return detailsRepository.deleteProduct(orderId, productId);
    }

    @Override
    public List getAllProducts(long orderId) {
        return detailsRepository.getAllProducts(orderId);
    }

    @Override
    public boolean deleteAllProducts(long orderId) {
        return detailsRepository.deleteAllProducts(orderId);
    }

    @Override
    public Order createOrderForUser(Long userId) {
        log.info(userId.toString());
        Order order= create(mapper.toDto(new Order(userId,"","")));
        log.info(order.toString());
        return order;
    }

}
