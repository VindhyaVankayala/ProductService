package com.example.productservice.thirdPartyClients;


import com.example.productservice.dtos.fakeStoreProductDto;
import com.example.productservice.exceptions.ProductNotFoundException;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

@Component
public class FakeStoreClient {

    private final RestTemplateBuilder restTemplateBuilder;
    private String fakeStoreUrl;
    private String pathForProducts;
    private final String specificProductUrl;
    private final String genericProductUrl;

    FakeStoreClient(RestTemplateBuilder restTemplateBuilder,
                    @Value("${fakestore.api.url}") String fakeStoreUrl,
                    @Value("${fakestore.api.paths.products}") String pathForProducts) {

        this.restTemplateBuilder = restTemplateBuilder;
        this.genericProductUrl = fakeStoreUrl + pathForProducts;
        this.specificProductUrl = fakeStoreUrl + pathForProducts + "/{id}";

    }

    public fakeStoreProductDto getProductById(Long id) /*throws ProductNotFoundException*/ {

        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<fakeStoreProductDto> responseEntity = restTemplate.getForEntity(specificProductUrl,fakeStoreProductDto.class,id);

        fakeStoreProductDto FakeStoreProductDto = responseEntity.getBody();

        if(FakeStoreProductDto == null){
            //throw new ProductNotFoundException("Product with id: " + id + " not found");
            return null;
        }
        return  FakeStoreProductDto;
    }




}
