package com.example.stline.repository;

import com.example.stline.entity.Order;

public interface OrderRepository extends BaseRepository {

    Order create(Order order);
    boolean close(long id);
    boolean delete( long id);
    Order getOrder(long id);
}
