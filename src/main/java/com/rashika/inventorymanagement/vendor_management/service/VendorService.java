package com.rashika.inventorymanagement.vendor_management.service;

import com.rashika.inventorymanagement.vendor_management.entity.Vendor;

import java.util.List;

public interface VendorService {
    public Vendor addVendor(Vendor vendor);

    public List<Vendor> getAllVendors();

    public Vendor getVendorById(Long vendorId);

    public void deleteVendorById(Long vendorId);

    public Vendor updateVendorById(Long vendorId, Vendor vendor);
}
