package com.example.productservice.services;

import com.example.productservice.dtos.GenericProductDto;
import com.example.productservice.dtos.fakeStoreProductDto;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

public interface ProductService {

    public GenericProductDto getProductById(Long id);

   List<GenericProductDto> getAllProducts();

    GenericProductDto deleteProductById(Long id);

    GenericProductDto createProduct(GenericProductDto genericProductDto);

    GenericProductDto updateProductById(Long id, GenericProductDto genericProductDto);
}





