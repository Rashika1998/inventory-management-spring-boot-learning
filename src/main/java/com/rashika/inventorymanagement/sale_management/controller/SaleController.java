package com.rashika.inventorymanagement.sale_management.controller;
import com.rashika.inventorymanagement.sale_management.entity.Sale;
import com.rashika.inventorymanagement.sale_management.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SaleController {

    @Autowired
    private SaleService saleService;

    @PostMapping("/sales")
    public Sale addNewSale(@RequestBody Sale sale){
        return saleService.addNewSale(sale);
    }

    @GetMapping("/sales")
    public List<Sale> getAllSales(){
        return saleService.getAllSales();
    }

}
