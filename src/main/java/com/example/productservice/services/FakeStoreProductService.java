package com.example.productservice.services;

import com.example.productservice.dtos.fakeStoreProductDto;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("FakeStoreProductService")
public class FakeStoreProductService implements ProductService {

    private RestTemplateBuilder restTemplateBuilder;
    private String getProductUrl = "https://fakestoreapi.com/products/1";

    FakeStoreProductService(RestTemplateBuilder restTemplateBuilder)
    {
        this.restTemplateBuilder = restTemplateBuilder;
    }
    @Override
    public fakeStoreProductDto getProductById(Long id) {
        //Rest Template
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<fakeStoreProductDto> responseEntity = restTemplate.getForEntity(getProductUrl,fakeStoreProductDto.class);

        return responseEntity.getBody();
    }

    @Override
    public void getAllProducts() {

    }

    @Override
    public void deleteProductById() {

    }

    @Override
    public void createProduct() {

    }

    @Override
    public void updateProductById() {

    }
}
