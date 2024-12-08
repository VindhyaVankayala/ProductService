package com.example.productservice.controllers;

import com.example.productservice.dtos.GenericProductDto;
import com.example.productservice.exceptions.ProductNotFoundException;
import com.example.productservice.services.ProductService;
import com.example.productservice.thirdPartyClients.FakeStoreClient;
import jakarta.inject.Inject;
import org.hibernate.sql.ast.tree.expression.CaseSimpleExpression;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.bind.annotation.PathVariable;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ProductControllerTest {

    @Inject
    private ProductController productController;
    @Inject
    private FakeStoreClient fakeStoreClient;

    @Qualifier("FakeStoreProductService")
    @MockBean
    private ProductService productService;

    @Test
    void testTwoTimesTwo(){
        //assert(2*2 == 4);
        //assertTrue(3 != 4);
        //assertEquals(5, 4);
        assertTrue(2==3);
    }

    @Test
    void testGetProductByIdNegativeTC(){
        //assertThrows(ProductNotFoundException.class,()-> productController.getProductById(100L));
        assertThrows(ProductNotFoundException.class,()-> fakeStoreClient.getProductById(100L));
        //assertNull(fakeStoreClient.getProductById(100L));
    }

    @Test
    void getProductByIdTest() throws ProductNotFoundException {

        GenericProductDto genericProductDto = new GenericProductDto();
        genericProductDto.setId(1L);
        genericProductDto.setTitle("Test Product");
        genericProductDto.setCategory("Test");
        genericProductDto.setDescription("Test");
        when(productService.getProductById(1l)).thenReturn(genericProductDto);

        GenericProductDto genericProductDto1 = productService.getProductById(1L);

        assertEquals(genericProductDto, genericProductDto1);

        //assertEquals(genericProductDto,productController.getProductById(1L))

    }

    @Test
    void testGetProductByIdNegTC() throws ProductNotFoundException{

        when(productService.getProductById((2L))).thenThrow(new ProductNotFoundException("Product not found"));
        assertThrows(ProductNotFoundException.class, () -> productController.getProductById(2L));

    }

}
