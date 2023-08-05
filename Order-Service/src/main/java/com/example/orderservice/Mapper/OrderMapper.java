package com.example.orderservice.Mapper;

import com.example.orderservice.Dto.OrderDto;
import com.example.orderservice.Model.Order;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;

@RequiredArgsConstructor
public class OrderMapper {
    private final ModelMapper modelMapper;
    public Order toEntity(OrderDto orderDto){
      return modelMapper.map(orderDto, Order.class);
    }
    public OrderDto toDto(Order order){
        return modelMapper.map(order, OrderDto.class);
    }
}
