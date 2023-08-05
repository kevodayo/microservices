package com.example.inventoryservice.Services;

import com.example.inventoryservice.Dto.InventoryDto;

import java.util.List;

public interface InventoryService {
    List<InventoryDto> isInStock(List<String> skuCode);
}
