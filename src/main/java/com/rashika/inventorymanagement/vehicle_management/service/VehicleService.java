package com.rashika.inventorymanagement.vehicle_management.service;


import com.rashika.inventorymanagement.vehicle_management.entity.Vehicle;

import java.util.List;

public interface VehicleService {
    public Vehicle addVehicle(Vehicle vehicle);

    public List<Vehicle> getAllVehicle();

    public Vehicle getVehicle(Long vehicleId);

    public void deleteVehicle(Long vehicleId);

    public Vehicle updateVehicle(Long vehicleId, Vehicle vehicle);
}
