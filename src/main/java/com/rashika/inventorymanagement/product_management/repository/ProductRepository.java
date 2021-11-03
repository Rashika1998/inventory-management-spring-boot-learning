package com.rashika.inventorymanagement.product_management.repository;

import com.rashika.inventorymanagement.product_management.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
