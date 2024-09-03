package com.example.productservice.inheritancerelations.tableperclass;

import com.example.productservice.inheritancerelations.mappedsuperclass.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("tpc_mentorrepository")
public interface MentorRepository extends JpaRepository<com.example.productservice.inheritancerelations.tableperclass.Mentor, Long> {

    Mentor save(Mentor mentor);
}
