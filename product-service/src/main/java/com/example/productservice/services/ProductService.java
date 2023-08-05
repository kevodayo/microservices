package com.example.productservice.services;

import com.example.productservice.Dto.ProductDto;

import java.util.List;

public interface ProductService {
    void createProduct(ProductDto productDto);

    List<ProductDto> getAllProducts();
}
