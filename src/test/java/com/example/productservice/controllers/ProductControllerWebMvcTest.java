package com.example.productservice.controllers;

import com.example.productservice.dtos.GenericProductDto;
import com.example.productservice.models.Product;
import com.example.productservice.services.ProductService;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ProductController.class)
public class ProductControllerWebMvcTest {

    @MockBean
    @Qualifier("FakeStorProductService")
    private ProductService productService;

    @Inject
    private ProductController productController;

    @Inject
    private MockMvc mockMvc;

    @Inject
    private ObjectMapper objectMapper;

    @Test
    void testGetAllProductsReturnsValidList() throws Exception{

        List<GenericProductDto> products = List.of(new GenericProductDto());
        when(productService.getAllProducts()).thenReturn(products);
        mockMvc.perform(get("/products"))
                .andExpect(status().isOk())
                .andExpect(content().json(objectMapper.writeValueAsString(products)));
    }
}
