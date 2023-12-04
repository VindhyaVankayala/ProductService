package com.example.productservice.services;

import com.example.productservice.dtos.GenericProductDto;
import com.example.productservice.dtos.fakeStoreProductDto;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service("FakeStoreProductService")
public class FakeStoreProductService implements ProductService {

    private RestTemplateBuilder restTemplateBuilder;
    private String specificProductUrl = "https://fakestoreapi.com/products/{id}";

    private String genericProductsUrl = "https://fakestoreapi.com/products";

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
        ResponseEntity<fakeStoreProductDto> responseEntity = restTemplate.getForEntity(specificProductUrl,fakeStoreProductDto.class,id);

        fakeStoreProductDto FakeStoreProductDto = responseEntity.getBody();

        return convertToGenericProductDto(FakeStoreProductDto);
    }

    @Override
    public List<GenericProductDto> getAllProducts() {

        List<GenericProductDto> genericProductDtos = new ArrayList<>();

        RestTemplate restTemplate = restTemplateBuilder.build();

        ResponseEntity<fakeStoreProductDto[]> responseEntity = restTemplate.getForEntity(genericProductsUrl,fakeStoreProductDto[].class);

        //List<fakeStoreProductDto> FakeStoreProductDtos = List.of(responseEntity.getBody());
        fakeStoreProductDto[] FakeStoreProductDtos = responseEntity.getBody();

        for(fakeStoreProductDto FakeStoreProductDto : FakeStoreProductDtos)
        {
            genericProductDtos.add(convertToGenericProductDto(FakeStoreProductDto));
        }

        return  genericProductDtos;
    }

    @Override
    public GenericProductDto deleteProductById(Long id) {

        /*RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<fakeStoreProductDto> responseEntity = restTemplate.delete(specificProductUrl,);
        fakeStoreProductDto FakeStoreProductDto = responseEntity.getBody();*/

        return null;
    }

    @Override
    public GenericProductDto createProduct(GenericProductDto genericProductDto) {

        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<fakeStoreProductDto> responseEntity = restTemplate.postForEntity(genericProductsUrl,genericProductDto,fakeStoreProductDto.class);
        fakeStoreProductDto FakeStoreProductDto = responseEntity.getBody();
        GenericProductDto genericProductDto2 = convertToGenericProductDto(FakeStoreProductDto);

        return  genericProductDto2;

    }

    @Override
    public void updateProductById() {

    }
}
