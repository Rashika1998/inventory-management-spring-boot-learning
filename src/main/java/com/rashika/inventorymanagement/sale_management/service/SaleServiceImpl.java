package com.rashika.inventorymanagement.sale_management.service;

import com.rashika.inventorymanagement.sale_management.entity.Sale;
import com.rashika.inventorymanagement.sale_management.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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

    @Override
    public Sale getASale(Long saleId) {
        return saleRepository.findById(saleId).get();
    }

    @Override
    public void deleteASale(Long saleId) {
        saleRepository.deleteById(saleId);
    }

    @Override
    public Sale updateSale(Long saleId, Sale sale) {

        Sale saleDB = saleRepository.findById(saleId).get();

        if (Objects.nonNull(sale.getSaleCode()) && !"".equalsIgnoreCase(sale.getSaleCode())){
            saleDB.setSaleCode(sale.getSaleCode());
        }

        if (Objects.nonNull(sale.getBuyerName()) && !"".equalsIgnoreCase(sale.getBuyerName())){
            saleDB.setBuyerName(sale.getBuyerName());
        }

        if (Objects.nonNull(sale.getBuyerAddress()) && !"".equalsIgnoreCase(sale.getBuyerAddress())){
            saleDB.setBuyerAddress(sale.getBuyerAddress());
        }

        if (Objects.nonNull(sale.getProductCode()) && !"".equalsIgnoreCase(sale.getProductCode())){
            saleDB.setProductCode(sale.getProductCode());
        }

        if (Objects.nonNull(sale.getProductQty())){
            saleDB.setProductQty(sale.getProductQty());
        }

        if (Objects.nonNull(sale.getTotalAmount())){
            saleDB.setTotalAmount(sale.getTotalAmount());
        }

        if (Objects.nonNull(sale.getDiscountAmount())){
            saleDB.setDiscountAmount(sale.getDiscountAmount());
        }

        if (Objects.nonNull(sale.isPaid())){
            saleDB.setPaid(sale.isPaid());
        }

        return saleRepository.save(saleDB);
    }


}
