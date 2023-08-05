package com.example.inventoryservice;

import com.example.inventoryservice.Mappers.InventoryMapper;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {
    @Bean
    public ModelMapper modelMapper () {

        return new ModelMapper();
    }
    @Bean
    public InventoryMapper inventoryMapper(ModelMapper modelMapper) {

        return new InventoryMapper(modelMapper);
    }
    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

}
