package com.rashika.inventorymanagement.product_management.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;
    private String productTitle;
    private String productCode;
    private String productType;
    private String productCategory;
    private String productVendorCompany;
    private double productPrice;
    private int productQty;
    private boolean productAvailability;
    private String productManufacturedDate;
    private String productExpiredDate;


    //Getters and setters
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductVendorCompany() {
        return productVendorCompany;
    }

    public void setProductVendorCompany(String productVendorCompany) {
        this.productVendorCompany = productVendorCompany;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQty() {
        return productQty;
    }

    public void setProductQty(int productQty) {
        this.productQty = productQty;
    }

    public boolean isProductAvailability() {
        return productAvailability;
    }

    public void setProductAvailability(boolean productAvailability) {
        this.productAvailability = productAvailability;
    }

    public String getProductManufacturedDate() {
        return productManufacturedDate;
    }

    public void setProductManufacturedDate(String productManufacturedDate) {
        this.productManufacturedDate = productManufacturedDate;
    }

    public String getProductExpiredDate() {
        return productExpiredDate;
    }

    public void setProductExpiredDate(String productExpiredDate) {
        this.productExpiredDate = productExpiredDate;
    }


    //Constructors
    public Product(Long productId, String productTitle, String productCode, String productType, String productCategory, String productVendorCompany, double productPrice, int productQty, boolean productAvailability, String productManufacturedDate, String productExpiredDate) {
        this.productId = productId;
        this.productTitle = productTitle;
        this.productCode = productCode;
        this.productType = productType;
        this.productCategory = productCategory;
        this.productVendorCompany = productVendorCompany;
        this.productPrice = productPrice;
        this.productQty = productQty;
        this.productAvailability = productAvailability;
        this.productManufacturedDate = productManufacturedDate;
        this.productExpiredDate = productExpiredDate;
    }

    public Product() {
    }

    //To string
    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productTitle='" + productTitle + '\'' +
                ", productCode='" + productCode + '\'' +
                ", productType='" + productType + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", productVendorCompany='" + productVendorCompany + '\'' +
                ", productPrice=" + productPrice +
                ", productQty=" + productQty +
                ", productAvailability=" + productAvailability +
                ", productManufacturedDate='" + productManufacturedDate + '\'' +
                ", productExpiredDate='" + productExpiredDate + '\'' +
                '}';
    }
}
