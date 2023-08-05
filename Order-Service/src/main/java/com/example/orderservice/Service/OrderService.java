package com.example.orderservice.Service;

import com.example.orderservice.Dto.OrderDto;

public interface OrderService {
    OrderDto placeOrder(OrderDto orderDto);
}
