package com.example.productservice.services;

import org.springframework.web.bind.annotation.PathVariable;

public interface ProductService {

    public String getProductById(Long id);

    void getAllProducts();

    void deleteProductById();

    void createProduct();

    void updateProductById();
}





