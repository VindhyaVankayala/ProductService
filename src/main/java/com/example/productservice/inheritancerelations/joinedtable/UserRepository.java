package com.example.productservice.inheritancerelations.joinedtable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("j_userrepository")
public interface UserRepository extends JpaRepository<com.example.productservice.inheritancerelations.joinedtable.User, Long> {

    @Override
    <S extends User> S save(S entity);
}
