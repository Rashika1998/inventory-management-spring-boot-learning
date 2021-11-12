package com.rashika.inventorymanagement.utility_management.repository;

import com.rashika.inventorymanagement.utility_management.entity.Utility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilityRepository extends JpaRepository<Utility, Long> {
}
