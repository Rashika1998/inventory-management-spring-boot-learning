package com.rashika.inventorymanagement.vendor_management.service;

import com.rashika.inventorymanagement.vendor_management.entity.Vendor;

import java.util.List;

public interface VendorService {
    public Vendor addVendor(Vendor vendor);

    public List<Vendor> getAllVendors();
}
