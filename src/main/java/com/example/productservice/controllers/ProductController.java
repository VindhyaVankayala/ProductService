package com.example.productservice.controllers;

import com.example.productservice.dtos.GenericProductDto;
import com.example.productservice.dtos.fakeStoreProductDto;
import com.example.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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
    public List<GenericProductDto> getAllProducts() {

        return productService.getAllProducts();
    }

    public void deleteProductById() {

    }

    @PostMapping
    public GenericProductDto createProduct(@RequestBody GenericProductDto genericProductDto) {

        return productService.createProduct(genericProductDto);
    }

    public void updateProductById() {

    }
}
