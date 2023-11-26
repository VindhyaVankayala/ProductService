package com.example.productservice.services;

import com.example.productservice.dtos.GenericProductDto;
import com.example.productservice.dtos.fakeStoreProductDto;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("FakeStoreProductService")
public class FakeStoreProductService implements ProductService {

    private RestTemplateBuilder restTemplateBuilder;
    private String getProductUrl = "https://fakestoreapi.com/products/1";

    private static GenericProductDto convertToGenericProductDto(fakeStoreProductDto FakeStoreProductDto)
    {
        GenericProductDto genericProductDto = new GenericProductDto();

        genericProductDto.setId(FakeStoreProductDto.getId());
        genericProductDto.setTitle(FakeStoreProductDto.getTitle());
        genericProductDto.setDescription(FakeStoreProductDto.getDescription());
        genericProductDto.setCategory(FakeStoreProductDto.getCategory());
        genericProductDto.setImage(FakeStoreProductDto.getImage());
        genericProductDto.setPrice(FakeStoreProductDto.getPrice());

        return genericProductDto;
    }

    FakeStoreProductService(RestTemplateBuilder restTemplateBuilder)
    {
        this.restTemplateBuilder = restTemplateBuilder;
    }
    @Override
    public GenericProductDto getProductById(Long id) {
        //Rest Template
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<fakeStoreProductDto> responseEntity = restTemplate.getForEntity(getProductUrl,fakeStoreProductDto.class);

        GenericProductDto genericProductDto = new GenericProductDto();
        fakeStoreProductDto FakeStoreProductDto = responseEntity.getBody();


        return convertToGenericProductDto(FakeStoreProductDto);
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
