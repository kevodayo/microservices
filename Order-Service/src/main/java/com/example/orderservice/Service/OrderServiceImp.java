package com.example.orderservice.Service;

import com.example.orderservice.Config.WebClientConfig;
import com.example.orderservice.Dto.OrderDto;
import com.example.orderservice.Mapper.OrderLineItemsMapper;
import com.example.orderservice.Mapper.OrderMapper;
import com.example.orderservice.Model.Order;
import com.example.orderservice.Model.OrderLineItems;
import com.example.orderservice.Repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.UUID;
@Service
@Slf4j
@RequiredArgsConstructor
public class OrderServiceImp implements OrderService{
    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;
    private final OrderLineItemsMapper orderLineItemsMapper;
//    private  final WebClient webClient;
    @Override
    public OrderDto placeOrder(OrderDto orderDto) {

        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());

        List<OrderLineItems> orderLineItemsList =  orderDto.getOrderLineItemsDtoList()
                .stream()
                .map(orderLineItemsMapper::toEntity).toList();
        order.setOrderLineItemsList(orderLineItemsList);

//        List<String> skuCodes = order.getOrderLineItemsList()
//                .stream()
//                .map(orderLineItems::getS)

//       Boolean result =  webClient.get()
//                .uri("http://localhost:9000/api/inventory")
//                .retrieve()
//                .bodyToMono(Boolean.class)
//                .block();
//       if (result){
//           orderRepository.save(order);
//       }else {
//           throw new IllegalArgumentException("Product is not instock. Please try again later");
//       }
        orderRepository.save(order);
        return orderMapper.toDto(order);
    }
}
