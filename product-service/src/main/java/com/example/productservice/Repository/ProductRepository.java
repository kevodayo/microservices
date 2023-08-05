package com.example.productservice.Repository;

import com.example.productservice.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
public interface ProductRepository extends JpaRepository<Product, BigDecimal> {
}
