package com.hannakot62.be.service;

import com.hannakot62.be.model.Order;

import java.util.List;

public interface OrderService {
    public Order saveOrder (Order order);
    public List<Order> getAllOrders();
    public Order getOrderById(String id);
    public void deleteOrderById(String id);
}
