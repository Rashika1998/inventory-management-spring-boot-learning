package com.rashika.inventorymanagement.product_management.service;
import com.rashika.inventorymanagement.product_management.entity.Product;
import com.rashika.inventorymanagement.product_management.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Objects;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long productId) {
        return productRepository.findById(productId).get();
    }

    @Override
    public void deleteProductById(Long productId) {
        productRepository.deleteById(productId);
    }

    @Override
    public Product updateProductById(Long productId, Product product) {

        Product productDB = productRepository.findById(productId).get();

        if (Objects.nonNull(product.getProductCode()) && !"".equalsIgnoreCase(product.getProductCode())){
            productDB.setProductCode(product.getProductCode());
        }

        if (Objects.nonNull(product.getProductTitle()) && !"".equalsIgnoreCase(product.getProductTitle())){
            productDB.setProductTitle(product.getProductTitle());
        }

        if (Objects.nonNull(product.getProductType()) && !"".equalsIgnoreCase(product.getProductType())){
            productDB.setProductType(product.getProductType());
        }

        if (Objects.nonNull(product.getProductCategory()) && !"".equalsIgnoreCase(product.getProductCategory())){
            productDB.setProductCategory(product.getProductCategory());
        }

        if (Objects.nonNull(product.getProductVendorCompany()) && !"".equalsIgnoreCase(product.getProductVendorCompany())){
            productDB.setProductVendorCompany(product.getProductVendorCompany());
        }

        if (Objects.nonNull(product.getProductPrice())){
            productDB.setProductPrice(product.getProductPrice());
        }

        if (Objects.nonNull(product.getProductQty())){
            productDB.setProductQty(product.getProductQty());
        }

        if (Objects.nonNull(product.isProductAvailability())){
            productDB.setProductAvailability(product.isProductAvailability());
        }

        if (Objects.nonNull(product.getProductManufacturedDate()) && !"".equalsIgnoreCase(product.getProductManufacturedDate())){
            productDB.setProductManufacturedDate(product.getProductManufacturedDate());
        }

        if (Objects.nonNull(product.getProductExpiredDate()) && !"".equalsIgnoreCase(product.getProductExpiredDate())){
            productDB.setProductExpiredDate(product.getProductExpiredDate());
        }

        return productRepository.save(productDB);
    }


}
