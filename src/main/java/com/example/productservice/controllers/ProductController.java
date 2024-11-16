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

    ProductController(@Qualifier("SelfProductService") ProductService productService)
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

    @DeleteMapping("/{id}")
    public GenericProductDto deleteProductById(@PathVariable("id") Long id) {

        return productService.deleteProductById(id);
    }

    @PostMapping
    public GenericProductDto createProduct(@RequestBody GenericProductDto genericProductDto) {

        return productService.createProduct(genericProductDto);
    }

    @PutMapping("/{id}")
    public GenericProductDto updateProductById(@PathVariable("id") Long id, @RequestBody GenericProductDto genericProductDto) {

        return productService.updateProductById(id, genericProductDto);

    }
}
