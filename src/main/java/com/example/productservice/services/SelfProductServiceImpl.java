package com.example.productservice.services;

import com.example.productservice.dtos.GenericProductDto;
import com.example.productservice.models.Product;
import com.example.productservice.repositories.ProductRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

//@Service("SelfProductService")

//@Primary
@Service
public class SelfProductServiceImpl implements ProductService{

    private  ProductRepository productRepository;

    SelfProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public GenericProductDto getProductById(Long id) {
        GenericProductDto genericProductDto = new GenericProductDto();
        Optional<Product> optionalProduct = productRepository.findById(UUID.fromString("4a5cbaca-c71c-4843-86b6-84711c3aa9e2"));
        Product product = optionalProduct.get();
        genericProductDto.setId(product.getId().getMostSignificantBits());
        genericProductDto.setTitle(product.getTitle());
        genericProductDto.setPrice(product.getPrice().getValue());
        genericProductDto.setCategory(product.getCategory().getName());
        genericProductDto.setDescription(product.getDescription());

        return genericProductDto;
    }

    @Override
    public List<GenericProductDto> getAllProducts() {
        return null;
    }

    @Override
    public GenericProductDto createProduct(GenericProductDto genericProductDto) {
        return null;
    }

    public GenericProductDto updateProductById(Long id, GenericProductDto genericProductDto) {
        return null;
    }

    public GenericProductDto deleteProductById(Long id) {
        return null;
    }
}
