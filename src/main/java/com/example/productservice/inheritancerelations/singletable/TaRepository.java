package com.example.productservice.inheritancerelations.singletable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("st_tarepository")
public interface TaRepository extends JpaRepository<com.example.productservice.inheritancerelations.singletable.Ta, Long> {

    @Override
    <S extends Ta> S save(S entity);
}
