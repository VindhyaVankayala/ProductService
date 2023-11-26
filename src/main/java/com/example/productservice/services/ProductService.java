package com.example.productservice.services;

import com.example.productservice.dtos.fakeStoreProductDto;
import org.springframework.web.bind.annotation.PathVariable;

public interface ProductService {

    public fakeStoreProductDto getProductById(Long id);

    void getAllProducts();

    void deleteProductById();

    void createProduct();

    void updateProductById();
}





