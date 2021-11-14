package com.rashika.inventorymanagement.vehicle_management.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long vehicleId;
    private String vehicleNumber;
    private String vehicleType;
    private String vehicleDriver;
    private String vehicleMaxWeight;
    private boolean vehicleLicense;

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleDriver() {
        return vehicleDriver;
    }

    public void setVehicleDriver(String vehicleDriver) {
        this.vehicleDriver = vehicleDriver;
    }

    public String getVehicleMaxWeight() {
        return vehicleMaxWeight;
    }

    public void setVehicleMaxWeight(String vehicleMaxWeight) {
        this.vehicleMaxWeight = vehicleMaxWeight;
    }

    public boolean isVehicleLicense() {
        return vehicleLicense;
    }

    public void setVehicleLicense(boolean vehicleLicense) {
        this.vehicleLicense = vehicleLicense;
    }


    public Vehicle(Long vehicleId, String vehicleNumber, String vehicleType, String vehicleDriver, String vehicleMaxWeight, boolean vehicleLicense) {
        this.vehicleId = vehicleId;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.vehicleDriver = vehicleDriver;
        this.vehicleMaxWeight = vehicleMaxWeight;
        this.vehicleLicense = vehicleLicense;
    }

    public Vehicle() {
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", vehicleDriver='" + vehicleDriver + '\'' +
                ", vehicleMaxWeight='" + vehicleMaxWeight + '\'' +
                ", vehicleLicense=" + vehicleLicense +
                '}';
    }


}
