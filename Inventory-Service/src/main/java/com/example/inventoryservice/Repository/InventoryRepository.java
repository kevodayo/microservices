package com.example.inventoryservice.Repository;

import com.example.inventoryservice.Model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface InventoryRepository extends JpaRepository<Inventory, BigDecimal> {
    List<Inventory> findBySkuCodeIn(List<String> skuCode);
}
