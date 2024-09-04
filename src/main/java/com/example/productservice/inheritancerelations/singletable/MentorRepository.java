package com.example.productservice.inheritancerelations.singletable;

import com.example.productservice.inheritancerelations.singletable.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("st_mentorrepository")
public interface MentorRepository extends JpaRepository<com.example.productservice.inheritancerelations.singletable.Mentor, Long> {

    Mentor save(Mentor mentor);
}
