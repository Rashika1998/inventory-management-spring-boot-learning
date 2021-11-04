package com.rashika.inventorymanagement.vendor_management.repository;
import com.rashika.inventorymanagement.vendor_management.entity.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Long> {

}
