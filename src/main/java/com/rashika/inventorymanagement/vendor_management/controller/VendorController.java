package com.rashika.inventorymanagement.vendor_management.controller;
import com.rashika.inventorymanagement.vendor_management.entity.Vendor;
import com.rashika.inventorymanagement.vendor_management.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VendorController {

    @Autowired
    private VendorService vendorService;

    @PostMapping("/vendors")
    public Vendor addVendor(@RequestBody Vendor vendor){
        return vendorService.addVendor(vendor);
    }

    @GetMapping("/vendors")
    public List<Vendor> getAllVendors(){
        return vendorService.getAllVendors();
    }

    @GetMapping("/vendors/{id}")
    public Vendor getVendorById(@PathVariable("id") Long vendorId){
        return vendorService.getVendorById(vendorId);
    }

    @DeleteMapping("/vendors/{id}")
    public String deleteVendorById(@PathVariable("id") Long vendorId){
        vendorService.deleteVendorById(vendorId);
        return "Vendor has been removed successfully.";
    }

    @PutMapping("/vendors/{id}")
    public Vendor updateVendorById(@PathVariable("id") Long vendorId,@RequestBody Vendor vendor){
        return vendorService.updateVendorById(vendorId, vendor);
    }







}
