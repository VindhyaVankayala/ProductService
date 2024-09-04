package com.example.productservice.inheritancerelations.singletable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("st_userrepository")
public interface UserRepository extends JpaRepository<com.example.productservice.inheritancerelations.singletable.User, Long> {

    @Override
    <S extends User> S save(S entity);
}
