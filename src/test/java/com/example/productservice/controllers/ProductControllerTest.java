package com.example.productservice.controllers;

import com.example.productservice.exceptions.ProductNotFoundException;
import com.example.productservice.thirdPartyClients.FakeStoreClient;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ProductControllerTest {

    private ProductController productController;
    @Inject
    private FakeStoreClient fakeStoreClient;

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
        //assertThrows(ProductNotFoundException.class,()-> fakeStoreClient.getProductById(100L));
        assertNull(fakeStoreClient.getProductById(100L));
    }
}
