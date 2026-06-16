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
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ProductController.class)
public class ProductControllerWebMvcTest {

    @MockBean
    @Qualifier("FakeStoreProductService")
    private ProductService productService;

    @Inject
    private ProductController productController;

    @Inject
    private MockMvc mockMvc;

    @Inject
    private ObjectMapper objectMapper;


    @Test
    void testGetProductsReturnsEmptyList() throws Exception {

        when(productService.getAllProducts()).thenReturn(new ArrayList<>());
        MvcResult result = mockMvc.perform((get("/products")))
                .andExpect(status().isOk())
                .andExpect(content().json("[]"))
                .andReturn();

        String jsonResponse = result.getResponse().getContentAsString();
        System.out.println("Response JSON: " + jsonResponse);
    }
    @Test
    void testGetAllProductsReturnsValidList() throws Exception{

        List<GenericProductDto> products = new ArrayList<>();
        products.add(new GenericProductDto());
        products.add(new GenericProductDto());
        when(productService.getAllProducts()).thenReturn(products);
        mockMvc.perform(get("/products"))
                .andExpect(status().isOk())
                .andExpect(content().json(objectMapper.writeValueAsString(products)));
    }

    @Test
    void testCreateProductApi() throws Exception {

        GenericProductDto genericProductDto = new GenericProductDto();
        genericProductDto.setId(100L);
        genericProductDto.setTitle("iPhone 16");
        genericProductDto.setDescription("2024 Model");
        genericProductDto.setCategory("Mobiles Phones");

        when(productService.createProduct((genericProductDto))).thenReturn(genericProductDto);

        MvcResult result = mockMvc.perform(post("/products")
                            .contentType(MediaType.APPLICATION_JSON)
                            .content(objectMapper.writeValueAsString(genericProductDto)))
                            .andExpect((status().isOk()))
                            .andExpect(content().json(objectMapper.writeValueAsString(genericProductDto))
                            ).andReturn();
    }
}
