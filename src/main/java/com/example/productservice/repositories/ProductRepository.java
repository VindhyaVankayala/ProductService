package com.example.productservice.repositories;

import com.example.productservice.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {

    List<Product> findAllByPrice_ValueBetween(Integer min, Integer max);

    List<Product> findAllByTitleAndDescription(String title, String description);

    List<Product> findAllByPrice_ValueGreaterThan(Integer value);

    List<Product> findAllByTitleLike(String title);

    List<Product> findAllByTitle(String title);
}
