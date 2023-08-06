package com.example.orderservice;

import com.example.orderservice.Mapper.OrderLineItemsMapper;
import com.example.orderservice.Mapper.OrderMapper;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class OrderServiceApplication {
    @Bean
    public ModelMapper modelMapper () {

        return new ModelMapper();
    }
    @Bean
    public OrderLineItemsMapper orderLineItemsMapper(ModelMapper modelMapper){
      return new OrderLineItemsMapper(modelMapper);
    }
    @Bean
    public OrderMapper orderMapper(ModelMapper modelMapper) {

        return new OrderMapper(modelMapper);
    }

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }

}
