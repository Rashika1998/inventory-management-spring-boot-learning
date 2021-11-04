package com.rashika.inventorymanagement.vendor_management.controller;
import com.rashika.inventorymanagement.vendor_management.entity.Vendor;
import com.rashika.inventorymanagement.vendor_management.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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







}
