package com.example.productservice.inheritancerelations.tableperclass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("tpc_tarepository")
public interface TaRepository extends JpaRepository<Ta, Long> {

    @Override
    <S extends Ta> S save(S entity);
}
