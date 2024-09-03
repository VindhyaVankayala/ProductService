package com.example.productservice.inheritancerelations.joinedtable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("j_studentrepository")
public interface StudentRepository extends JpaRepository<com.example.productservice.inheritancerelations.joinedtable.Student, Long> {

    @Override
    <S extends Student> S save(S entity);
}
