package com.dave.productapi.dto;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductResponseDTO {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private String quantity;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
