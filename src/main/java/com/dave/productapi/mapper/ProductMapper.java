package com.dave.productapi.mapper;

import com.dave.productapi.dto.ProductResponseDTO;
import com.dave.productapi.entity.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product toEntity(ProductResponseDTO dto);
    ProductResponseDTO toDto(Product product);
}
