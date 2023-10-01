package com.example.Ecommerce.service;

import com.example.Ecommerce.model.Order;
import com.example.Ecommerce.repo.IOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    IOrder orderRepo;

    public void placeAnOrder(List<Order> newOrder) {
        orderRepo.saveAll(newOrder);
    }

    public Optional<Order> getOrderById(Integer id) {
        return orderRepo.findById(id);
    }
}
