package com.example.orderservice.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItemsDto {
    private BigDecimal id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}
