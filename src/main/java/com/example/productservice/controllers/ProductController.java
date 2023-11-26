package com.example.productservice.controllers;

import com.example.productservice.dtos.GenericProductDto;
import com.example.productservice.dtos.fakeStoreProductDto;
import com.example.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    ProductController(@Qualifier("FakeStoreProductService") ProductService productService)
    {
        this.productService = productService;
    }
    @GetMapping("/{id}")
    public GenericProductDto getProductById(@PathVariable("id") Long id) {
        //System.out.printf("Hello Vindhya, This is your first Spring Boot Project!! Yayyyy!!!");
        //Call fakestoreProductService getProductById() method
    return productService.getProductById(id);
    }
    @GetMapping
    public void getAllProducts() {

    }

    public void deleteProductById() {

    }

    public void createProduct() {

    }

    public void updateProductById() {

    }
}
