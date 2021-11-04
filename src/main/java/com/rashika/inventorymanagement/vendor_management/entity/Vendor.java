package com.rashika.inventorymanagement.vendor_management.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long vendorId;

    private String vendorCompanyName;
    private String vendorDesc;
    private String vendorCompanyAddress;
    private String vendorAssignDate;
    private String vendorAgreementEndDate;
    private boolean vendorAvailability;
    private double vendorDestinationInKm;
    private String vendorItemTransportType;

    public Long getVendorId() {
        return vendorId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorCompanyName() {
        return vendorCompanyName;
    }

    public void setVendorCompanyName(String vendorCompanyName) {
        this.vendorCompanyName = vendorCompanyName;
    }

    public String getVendorDesc() {
        return vendorDesc;
    }

    public void setVendorDesc(String vendorDesc) {
        this.vendorDesc = vendorDesc;
    }

    public String getVendorCompanyAddress() {
        return vendorCompanyAddress;
    }

    public void setVendorCompanyAddress(String vendorCompanyAddress) {
        this.vendorCompanyAddress = vendorCompanyAddress;
    }

    public String getVendorAssignDate() {
        return vendorAssignDate;
    }

    public void setVendorAssignDate(String vendorAssignDate) {
        this.vendorAssignDate = vendorAssignDate;
    }

    public String getVendorAgreementEndDate() {
        return vendorAgreementEndDate;
    }

    public void setVendorAgreementEndDate(String vendorAgreementEndDate) {
        this.vendorAgreementEndDate = vendorAgreementEndDate;
    }

    public boolean isVendorAvailability() {
        return vendorAvailability;
    }

    public void setVendorAvailability(boolean vendorAvailability) {
        this.vendorAvailability = vendorAvailability;
    }

    public double getVendorDestinationInKm() {
        return vendorDestinationInKm;
    }

    public void setVendorDestinationInKm(double vendorDestinationInKm) {
        this.vendorDestinationInKm = vendorDestinationInKm;
    }

    public String getVendorItemTransportType() {
        return vendorItemTransportType;
    }

    public void setVendorItemTransportType(String vendorItemTransportType) {
        this.vendorItemTransportType = vendorItemTransportType;
    }

    public Vendor(Long vendorId, String vendorCompanyName, String vendorDesc, String vendorCompanyAddress, String vendorAssignDate, String vendorAgreementEndDate, boolean vendorAvailability, double vendorDestinationInKm, String vendorItemTransportType) {
        this.vendorId = vendorId;
        this.vendorCompanyName = vendorCompanyName;
        this.vendorDesc = vendorDesc;
        this.vendorCompanyAddress = vendorCompanyAddress;
        this.vendorAssignDate = vendorAssignDate;
        this.vendorAgreementEndDate = vendorAgreementEndDate;
        this.vendorAvailability = vendorAvailability;
        this.vendorDestinationInKm = vendorDestinationInKm;
        this.vendorItemTransportType = vendorItemTransportType;
    }

    public Vendor() {
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "vendorId=" + vendorId +
                ", vendorCompanyName='" + vendorCompanyName + '\'' +
                ", vendorDesc='" + vendorDesc + '\'' +
                ", vendorCompanyAddress='" + vendorCompanyAddress + '\'' +
                ", vendorAssignDate='" + vendorAssignDate + '\'' +
                ", vendorAgreementEndDate='" + vendorAgreementEndDate + '\'' +
                ", vendorAvailability=" + vendorAvailability +
                ", vendorDestinationInKm=" + vendorDestinationInKm +
                ", vendorItemTransportType='" + vendorItemTransportType + '\'' +
                '}';
    }
}
