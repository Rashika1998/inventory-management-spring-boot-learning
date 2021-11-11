package com.rashika.inventorymanagement.sale_management.controller;
import com.rashika.inventorymanagement.sale_management.entity.Sale;
import com.rashika.inventorymanagement.sale_management.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/sales/{id}")
    public Sale getASale(@PathVariable("id") Long saleId){
        return saleService.getASale(saleId);
    }

    @DeleteMapping("/sales/{id}")
    public String deleteASale(@PathVariable("id") Long saleId){
        saleService.deleteASale(saleId);
        return "Sale has been successfully deleted.";
    }

    @PutMapping("/sales/{id}")
    public Sale updateSale(@PathVariable("id") Long saleId, @RequestBody Sale sale){
        return saleService.updateSale(saleId, sale);
    }

}
