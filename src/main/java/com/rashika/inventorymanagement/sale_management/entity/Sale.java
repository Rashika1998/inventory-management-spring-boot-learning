package com.rashika.inventorymanagement.sale_management.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long saleId;

    private String saleCode;
    private String buyerName;
    private String buyerAddress;
    private String productCode;
    private int productQty;
    private double totalAmount;
    private double discountAmount;
    private boolean isPaid;

    public Long getSaleId() {
        return saleId;
    }

    public void setSaleId(Long saleId) {
        this.saleId = saleId;
    }

    public String getSaleCode() {
        return saleCode;
    }

    public void setSaleCode(String saleCode) {
        this.saleCode = saleCode;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerAddress() {
        return buyerAddress;
    }

    public void setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public int getProductQty() {
        return productQty;
    }

    public void setProductQty(int productQty) {
        this.productQty = productQty;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public Sale(Long saleId, String saleCode, String buyerName, String buyerAddress, String productCode, int productQty, double totalAmount, double discountAmount, boolean isPaid) {
        this.saleId = saleId;
        this.saleCode = saleCode;
        this.buyerName = buyerName;
        this.buyerAddress = buyerAddress;
        this.productCode = productCode;
        this.productQty = productQty;
        this.totalAmount = totalAmount;
        this.discountAmount = discountAmount;
        this.isPaid = isPaid;
    }

    public Sale() {
    }

    @Override
    public String toString() {
        return "Sale{" +
                "saleId=" + saleId +
                ", saleCode='" + saleCode + '\'' +
                ", buyerName='" + buyerName + '\'' +
                ", buyerAddress='" + buyerAddress + '\'' +
                ", productCode='" + productCode + '\'' +
                ", productQty=" + productQty +
                ", totalAmount=" + totalAmount +
                ", discountAmount=" + discountAmount +
                ", isPaid=" + isPaid +
                '}';
    }
}
