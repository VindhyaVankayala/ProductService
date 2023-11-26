package com.example.productservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class fakeStoreProductDto {

    //same attributes as the output of fakestore API

    private Long id;
    private String title;
    private Double price;
    private String category;
    private String description;
    private String image;
}
