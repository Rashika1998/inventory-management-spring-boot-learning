package com.rashika.inventorymanagement.vehicle_management.controller;

import com.rashika.inventorymanagement.vehicle_management.entity.Vehicle;
import com.rashika.inventorymanagement.vehicle_management.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping("/vehicles")
    public Vehicle addVehicle(@RequestBody Vehicle vehicle){
        return vehicleService.addVehicle(vehicle);
    }

    @GetMapping("/vehicles")
    public List<Vehicle> getAllVehicle(){
        return vehicleService.getAllVehicle();
    }

    @GetMapping("/vehicles/{id}")
    public Vehicle getVehicle(@PathVariable("id") Long vehicleId){
        return vehicleService.getVehicle(vehicleId);
    }

    @DeleteMapping("vehicles/{id}")
    public String deleteVehicle(@PathVariable("id") Long vehicleId){
        vehicleService.deleteVehicle(vehicleId);
        return "Vehicle has been deleted.";
    }

    @PutMapping("/vehicles/{id}")
    public Vehicle updateVehicle(@PathVariable("id") Long vehicleId, @RequestBody Vehicle vehicle){
        return vehicleService.updateVehicle(vehicleId, vehicle);
    }

}
