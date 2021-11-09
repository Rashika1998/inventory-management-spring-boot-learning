package com.rashika.inventorymanagement.sale_management.service;

import com.rashika.inventorymanagement.sale_management.entity.Sale;

import java.util.List;

public interface SaleService {

    public Sale addNewSale(Sale sale);

    public List<Sale> getAllSales();
}
