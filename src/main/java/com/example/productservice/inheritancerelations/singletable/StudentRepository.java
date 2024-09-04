package com.example.productservice.inheritancerelations.singletable;

import com.example.productservice.inheritancerelations.singletable.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("st_studentrepository")
public interface StudentRepository extends JpaRepository<com.example.productservice.inheritancerelations.singletable.Student, Long> {
    @Override
    com.example.productservice.inheritancerelations.singletable.Student save(Student student);
}
