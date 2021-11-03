package com.rashika.inventorymanagement.product_management.controller;

import com.rashika.inventorymanagement.product_management.entity.Product;
import com.rashika.inventorymanagement.product_management.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable("id") Long productId){
        return productService.getProductById(productId);
    }

    @DeleteMapping("/products/{id}")
    public String deleteProductById(@PathVariable("id") Long productId){
        productService.deleteProductById(productId);
        return "Deleted Successfully.";
    }

    @PutMapping("/products/{id}")
    public Product updateProductById(@PathVariable("id") Long productId,@RequestBody Product product){
        return productService.updateProductById(productId, product);
    }

}
