package com.rashika.inventorymanagement.product_management.service;

import com.rashika.inventorymanagement.product_management.entity.Product;

import java.util.List;

public interface ProductService {
    public Product addProduct(Product product);

    public List<Product> getAllProducts();

    public Product getProductById(Long productId);

    public void deleteProductById(Long productId);

    Product updateProductById(Long productId, Product product);
}
