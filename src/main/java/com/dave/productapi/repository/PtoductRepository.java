package com.dave.productapi.repository;

import com.dave.productapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PtoductRepository extends JpaRepository<Product, Long> {
}
