package com.paradox.geeks.service;

import com.paradox.geeks.model.Product;

import java.util.Collection;

public interface ProductService {
    void createProduct(Product product);
    void updateProduct(String id, Product product);
    void deleteProduct(String id);
    Collection<Product> getProducts();
    Product getProduct(String id);
}
