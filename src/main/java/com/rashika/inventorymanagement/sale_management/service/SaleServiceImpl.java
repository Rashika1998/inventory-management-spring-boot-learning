package com.rashika.inventorymanagement.sale_management.service;

import com.rashika.inventorymanagement.sale_management.entity.Sale;
import com.rashika.inventorymanagement.sale_management.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleServiceImpl implements SaleService{

    @Autowired
    private SaleRepository saleRepository;

    @Override
    public Sale addNewSale(Sale sale) {
        return saleRepository.save(sale);
    }

    @Override
    public List<Sale> getAllSales() {
        return saleRepository.findAll();
    }


}
