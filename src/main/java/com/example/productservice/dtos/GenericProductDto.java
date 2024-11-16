package com.example.productservice.dtos;

import lombok.Getter;

import java.util.UUID;

@Getter
public class GenericProductDto {

    private Long id;
    private String title;
    private Double price;
    private String category;
    private String description;
    private String image;

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
