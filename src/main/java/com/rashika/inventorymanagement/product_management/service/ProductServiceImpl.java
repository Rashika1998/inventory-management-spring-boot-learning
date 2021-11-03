package com.rashika.inventorymanagement.product_management.service;
import com.rashika.inventorymanagement.product_management.entity.Product;
import com.rashika.inventorymanagement.product_management.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }
}
