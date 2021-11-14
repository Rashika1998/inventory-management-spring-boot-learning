package com.rashika.inventorymanagement.vehicle_management.repository;

import com.rashika.inventorymanagement.vehicle_management.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
