package com.example.inventoryservice.Mappers;

import com.example.inventoryservice.Dto.InventoryDto;
import com.example.inventoryservice.Model.Inventory;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;

@RequiredArgsConstructor
public class InventoryMapper {

    private final ModelMapper modelMapper;
    public Inventory toEntity(InventoryDto inventoryDto){
        return modelMapper.map(inventoryDto, Inventory.class);
    }
    public InventoryDto toDto(Inventory inventory){
        return modelMapper.map(inventory, InventoryDto.class);
    }
}
