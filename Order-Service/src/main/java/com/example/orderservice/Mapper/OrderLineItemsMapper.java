package com.example.orderservice.Mapper;

import com.example.orderservice.Dto.OrderLineItemsDto;
import com.example.orderservice.Model.OrderLineItems;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
@RequiredArgsConstructor
public class OrderLineItemsMapper {
    private final ModelMapper modelMapper;

    public OrderLineItems toEntity(OrderLineItemsDto orderLineItemsDto){
       return modelMapper.map(orderLineItemsDto, OrderLineItems.class);
    }
    public OrderLineItemsDto toDto(OrderLineItems orderLineItems){
        return modelMapper.map(orderLineItems, OrderLineItemsDto.class);
    }
}
