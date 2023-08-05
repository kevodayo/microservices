package com.example.productservice.mapper;

import com.example.productservice.Dto.ProductDto;
import com.example.productservice.Model.Product;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;

@RequiredArgsConstructor
public class ProductMapper {
    private final ModelMapper mapper;
    public Product toEntity(ProductDto productDto){
        Product mapped = mapper.map(productDto, Product.class);
        return mapped;
    }
    public ProductDto toDto(Product product){
        ProductDto mapped = mapper.map(product, ProductDto.class);
        return mapped;
    }
}
