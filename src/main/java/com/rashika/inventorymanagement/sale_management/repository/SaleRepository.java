package com.rashika.inventorymanagement.sale_management.repository;

import com.rashika.inventorymanagement.sale_management.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
}
