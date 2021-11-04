package com.rashika.inventorymanagement.vendor_management.service;
import com.rashika.inventorymanagement.vendor_management.entity.Vendor;
import com.rashika.inventorymanagement.vendor_management.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class VendorServiceImpl implements VendorService{

    @Autowired
    private VendorRepository vendorRepository;

    @Override
    public Vendor addVendor(Vendor vendor) {
        return vendorRepository.save(vendor);
    }

    @Override
    public List<Vendor> getAllVendors() {
        return vendorRepository.findAll();
    }

    @Override
    public Vendor getVendorById(Long vendorId) {
        return vendorRepository.findById(vendorId).get();
    }

    @Override
    public void deleteVendorById(Long vendorId) {
        vendorRepository.deleteById(vendorId);
    }

    @Override
    public Vendor updateVendorById(Long vendorId, Vendor vendor) {
        Vendor vendorDB = vendorRepository.findById(vendorId).get();

        if (Objects.nonNull(vendor.getVendorCompanyName()) && !"".equalsIgnoreCase(vendor.getVendorCompanyName())){
            vendorDB.setVendorCompanyName(vendor.getVendorCompanyName());
        }

        if (Objects.nonNull(vendor.getVendorDesc()) && !"".equalsIgnoreCase(vendor.getVendorDesc())){
            vendorDB.setVendorDesc(vendor.getVendorDesc());
        }

        if (Objects.nonNull(vendor.getVendorCompanyAddress()) && !"".equalsIgnoreCase(vendor.getVendorCompanyAddress())){
            vendorDB.setVendorCompanyAddress(vendor.getVendorCompanyAddress());
        }

        if (Objects.nonNull(vendor.getVendorAssignDate()) && !"".equalsIgnoreCase(vendor.getVendorAssignDate())){
            vendorDB.setVendorAssignDate(vendor.getVendorAssignDate());
        }

        if (Objects.nonNull(vendor.getVendorAgreementEndDate()) && !"".equalsIgnoreCase(vendor.getVendorAgreementEndDate())){
            vendorDB.setVendorAgreementEndDate(vendor.getVendorAgreementEndDate());
        }

        if (Objects.nonNull(vendor.isVendorAvailability())){
            vendorDB.setVendorAvailability(vendor.isVendorAvailability());
        }

        if (Objects.nonNull(vendor.getVendorDestinationInKm())){
            vendorDB.setVendorDestinationInKm(vendor.getVendorDestinationInKm());
        }

        if (Objects.nonNull(vendor.getVendorItemTransportType()) && !"".equalsIgnoreCase(vendor.getVendorItemTransportType())){
            vendorDB.setVendorItemTransportType(vendor.getVendorItemTransportType());
        }

        return vendorRepository.save(vendorDB);
    }
}
