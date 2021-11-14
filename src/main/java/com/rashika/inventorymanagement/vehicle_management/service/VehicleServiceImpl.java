package com.rashika.inventorymanagement.vehicle_management.service;

import com.rashika.inventorymanagement.vehicle_management.entity.Vehicle;
import com.rashika.inventorymanagement.vehicle_management.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public Vehicle addVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public List<Vehicle> getAllVehicle() {
        return vehicleRepository.findAll();
    }

    @Override
    public Vehicle getVehicle(Long vehicleId) {
        return vehicleRepository.findById(vehicleId).get();
    }

    @Override
    public void deleteVehicle(Long vehicleId) {
        vehicleRepository.deleteById(vehicleId);
    }

    @Override
    public Vehicle updateVehicle(Long vehicleId, Vehicle vehicle) {
        Vehicle vehicleDB = vehicleRepository.findById(vehicleId).get();

        if (Objects.nonNull(vehicle.getVehicleNumber()) && !"".equalsIgnoreCase(vehicle.getVehicleNumber())){
            vehicleDB.setVehicleNumber(vehicle.getVehicleNumber());
        }

        if (Objects.nonNull(vehicle.getVehicleType()) && !"".equalsIgnoreCase(vehicle.getVehicleType())){
            vehicleDB.setVehicleType(vehicle.getVehicleType());
        }

        if (Objects.nonNull(vehicle.getVehicleDriver()) && !"".equalsIgnoreCase(vehicle.getVehicleDriver())){
            vehicleDB.setVehicleDriver(vehicle.getVehicleDriver());
        }

        if (Objects.nonNull(vehicle.getVehicleMaxWeight()) && !"".equalsIgnoreCase(vehicle.getVehicleMaxWeight())){
            vehicleDB.setVehicleMaxWeight(vehicle.getVehicleMaxWeight());
        }

        if (Objects.nonNull(vehicle.isVehicleLicense())){
            vehicleDB.setVehicleLicense(vehicle.isVehicleLicense());
        }

        return vehicleRepository.save(vehicleDB);

    }
}
