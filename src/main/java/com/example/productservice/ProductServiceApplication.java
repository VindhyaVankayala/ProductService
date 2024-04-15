package com.example.productservice;

import com.example.productservice.inheritancerelations.mappedsuperclass.Student;
import com.example.productservice.inheritancerelations.mappedsuperclass.StudentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductServiceApplication implements CommandLineRunner {
    private StudentRepository studentRepository;

    ProductServiceApplication(@Qualifier("ms_studentrepository") StudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }

    public static void main(String[] args) {

        SpringApplication.run(ProductServiceApplication.class, args);
    }

    public void run(String... args) throws Exception {
        Student student = new Student();
        student.setName("Vindhya");
        student.setPsp(80.00);
        student.setAttendance(90.00);
        student.setCurrent_company("Amdocs");
        student.setYear_of_passing((long)2019);
        student.setId((long)1);

        studentRepository.save(student);

    }

}
