package com.codegym.demosellphone.service.impl;

import com.codegym.demosellphone.model.OrderDetails;
import com.codegym.demosellphone.repo.OrderDetailsRepository;
import com.codegym.demosellphone.service.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderDetailsServiceImpl implements OrderDetailsService {
    @Autowired
    private OrderDetailsRepository orderDetailsRepository;

    @Override
    public void save(OrderDetails orderDetails) {
        orderDetailsRepository.save(orderDetails);
    }
}
