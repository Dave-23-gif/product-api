package com.dave.productapi.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductRequestDTO {
    private String name;
    private String description;
    private BigDecimal price;
    private String quantity;
}
