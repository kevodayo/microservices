package com.example.productservice.services;

import com.example.productservice.Dto.ProductDto;
import com.example.productservice.Model.Product;
import com.example.productservice.Repository.ProductRepository;
import com.example.productservice.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductServiceImp implements ProductService{

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    @Override
    public void createProduct(ProductDto productDto) {

        Product product = productMapper.toEntity(productDto);
        productRepository.save(product);
        log.info("Product {} is saved", product.getId());
    }
    @Override
    public List<ProductDto> getAllProducts() {
        List<Product> productList = productRepository.findAll();
        return productList.stream().map(productMapper::toDto).collect(Collectors.toList());
    }
}
