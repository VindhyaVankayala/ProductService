package com.example.productservice.services;

import com.example.productservice.dtos.GenericProductDto;
import com.example.productservice.dtos.fakeStoreProductDto;
import com.example.productservice.exceptions.ProductNotFoundException;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

public interface ProductService {

    public GenericProductDto getProductById(Long id) throws ProductNotFoundException;

   List<GenericProductDto> getAllProducts();

    GenericProductDto deleteProductById(Long id);

    GenericProductDto createProduct(GenericProductDto genericProductDto);

    GenericProductDto updateProductById(Long id, GenericProductDto genericProductDto);
}





