package com.example.inventoryservice;

import com.example.inventoryservice.Mappers.InventoryMapper;
import com.example.inventoryservice.Model.Inventory;
import com.example.inventoryservice.Repository.InventoryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
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
//    @Bean
//    public CommandLineRunner loadData(InventoryRepository inventoryRepository){
//        return args -> {
//            Inventory inventory = new Inventory();
//            inventory.setSkuCode("iphone_13");
//            inventory.setQuantity(108);
//
//            Inventory inventory1 = new Inventory();
//            inventory1.setSkuCode("nokia_12");
//            inventory1.setQuantity(0);
//            inventoryRepository.save(inventory);
//            inventoryRepository.save(inventory1);
//        };
//    }

}
