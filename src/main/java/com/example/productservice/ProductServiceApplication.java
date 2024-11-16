package com.example.productservice;

/*import com.example.productservice.inheritancerelations.mappedsuperclass.Mentor;
import com.example.productservice.inheritancerelations.mappedsuperclass.MentorRepository;
import com.example.productservice.inheritancerelations.mappedsuperclass.Student;
import com.example.productservice.inheritancerelations.mappedsuperclass.StudentRepository;*/
//import com.example.productservice.inheritancerelations.tableperclass.*;
//import com.example.productservice.inheritancerelations.joinedtable.*;
import com.example.productservice.inheritancerelations.singletable.*;
import com.example.productservice.models.Category;
import com.example.productservice.models.Price;
import com.example.productservice.models.Product;
import com.example.productservice.repositories.CategoryRepository;
import com.example.productservice.repositories.PriceRepository;
import com.example.productservice.repositories.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
public class ProductServiceApplication implements CommandLineRunner {
    //private StudentRepository studentRepository;
    //private MentorRepository mentorRepository;

    //private TaRepository taRepository;

    //private UserRepository userRepository;
    private final CategoryRepository categoryRepository;
    private final PriceRepository priceRepository;
    private final ProductRepository productRepository;
//    private final ProductRepository productRepository;
//    private com.example.productservice.inheritancerelations.singletable.UserRepository s_userrepository;
//    //private com.example.productservice.inheritancerelations.joinedtable.StudentRepository j_studentrepository;
//    private com.example.productservice.inheritancerelations.singletable.StudentRepository s_studentrepository;
//    //private com.example.productservice.inheritancerelations.joinedtable.MentorRepository j_mentorrepository;
//    private com.example.productservice.inheritancerelations.singletable.MentorRepository s_mentorrepository;
//    private com.example.productservice.inheritancerelations.singletable.TaRepository s_tarepository;

//    ProductServiceApplication(@Qualifier("st_userrepository") com.example.productservice.inheritancerelations.singletable.UserRepository s_userrepository,
//                              @Qualifier("st_studentrepository") com.example.productservice.inheritancerelations.singletable.StudentRepository s_studentrepository,
//                              @Qualifier("st_mentorrepository") com.example.productservice.inheritancerelations.singletable.MentorRepository s_mentorrepository,
//                              @Qualifier("st_tarepository") com.example.productservice.inheritancerelations.singletable.TaRepository s_tarepository) {
        //this.studentRepository = studentRepository;
        //this.mentorRepository = mentorRepository;
        //this.userRepository = userRepository;
        //this.taRepository = taRepository;
        /*this.j_userrepository = j_userrepository;
        this.j_mentorrepository = j_mentorrepository;
        this.j_studentrepository = j_studentrepository;*/
//        this.s_studentrepository = s_studentrepository;
//        this.s_mentorrepository = s_mentorrepository;
//        this.s_userrepository = s_userrepository;
//        this.s_tarepository = s_tarepository;
//    }

//    ProductServiceApplication(@Qualifier("categoryRepository") CategoryRepository categoryRepository,
//                              @Qualifier("productRepository") ProductRepository productRepository) {
//        this.categoryRepository = categoryRepository;
//        this.productRepository = productRepository;
//    }

    ProductServiceApplication(@Qualifier("categoryRepository") CategoryRepository categoryRepository,
                              PriceRepository priceRepository,
                              ProductRepository productRepository) {
        this.categoryRepository = categoryRepository;
        this.priceRepository = priceRepository;
        this.productRepository = productRepository;
    }

    /*ProductServiceApplication(@Qualifier("ms_mentorrepository") MentorRepository mentorRepository) {
        this.mentorRepository = mentorRepository;
    }*/

    public static void main(String[] args) {

        SpringApplication.run(ProductServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Student student = new Student();
//        student.setName("Vindhya");
//        student.setPsp(80.00);
//        student.setAttendance(90.00);
//        student.setCurrent_company("Amdocs");
//        student.setYear_of_passing((long)2019);

        //studentRepository.save(student);
        //j_studentrepository.save(student);
//        s_studentrepository.save(student);
//        Mentor mentor = new Mentor();
//        mentor.setName("Kshitij");
//        mentor.setAvg_rating(4.5);
//        mentor.setCurrent_company("Scaler");
//        mentor.setYears_of_experience((long) 7);
//        mentor.setTotal_no_of_mentees((long) 10);
//        mentor.setTotal_sessions_taken((long) 100);
//        mentor.setEmail_id("Kshitij@scaler.com");

        //mentorRepository.save(mentor);
        //j_mentorrepository.save(mentor);
//        s_mentorrepository.save(mentor);
//        User user = new User();
//        user.setName("Vindhya");
//        user.setEmail_id("vindhya@hotmail.com");

        //userRepository.save(user);
        //j_userrepository.save(user);
//        s_userrepository.save(user);
//        Ta ta = new Ta();
//        ta.setName("Manoj");
//        ta.setAvg_rating(4.8);
//        ta.setUniversity("DU");

        //taRepository.save(ta);
//        s_tarepository.save(ta);
        //Get all the users

        /*List<User> users = userRepository.findAll();
        for(User user1: users){
            System.out.println(user1.toString());
        }*/

//        Category category = new Category();
//        category.setName("Apple");
//        Category savedCategory = categoryRepository.save(category);

//        Optional<Category> optionalcategory = categoryRepository.findById(UUID.fromString("0c9e1dce-ea31-47e3-8db7-5a96018fb9b1"));
//
//        if(optionalcategory.isEmpty())
//        {
//            throw new Exception("category is NULL");
//        }
//        Category category = optionalcategory.get();

//        Product product = new Product();
//        product.setTitle("Iphone 12");
//        product.setPrice(79999.00);
//        product.setDescription("This is a new Iphone 12");
//        product.setCategory(category);

//        productRepository.save(product);

        //Find all products with category = Apple Devices
//        List<Product> products = category.getProducts();
//
//        for(Product product: products){
//            System.out.println(product.getTitle());
//        }

//        Category category = new Category();
//        category.setName("Apple Devices");
//
//        Category savedCategory = categoryRepository.save(category);

//        Price price = new Price();
//        price.setCurrency("INR");
//        price.setValue(80000.00);
//        Price savedPrice = priceRepository.save(price);

//        Product product = new Product();
//        product.setCategory(savedCategory);
//        product.setTitle("Iphone 12");
//        product.setDescription("2021 model");
//        product.setPrice(price);

//        Product savedProduct = productRepository.save(product);

//        productRepository.deleteById(savedProduct.getId());

//        Optional<Category> optionalCategory = categoryRepository.findById(UUID.fromString("2226e5e3-31e5-49e0-a6da-1df4049bc730"));
//        Category category = optionalCategory.get();

//        Price price2 = new Price();
//        price2.setCurrency("AED");
//        price2.setValue(4000.00);
//        //Price savedPrice2 = priceRepository.save(price2);
//
//        Product product2 = new Product();
//        product2.setTitle("Iphone 13");
//        product2.setDescription("2022 model");
//        product2.setCategory(category);
//        product2.setPrice(price2);
//        Product savedProduct2 = productRepository.save(product2);

//        Price price3 = new Price();
//        price3.setCurrency("USD");
//        price3.setValue(1000.00);
//
//        Product product3 = new Product();
//        product3.setTitle("Iphone 14");
//        product3.setDescription("2023 model");
//        product3.setCategory(category);
//        product3.setPrice(price3);
//        Product savedProduct3 = productRepository.save(product3);

//            List<Product> products = category.getProducts();
//
//            for(Product product: products){
//                System.out.println(product.getTitle());
//            }
//        categoryRepository.deleteById(UUID.fromString("471b8ab0-a266-4a57-aad6-016f9f1f8d48"));
//        Category category = new Category();
//        category.setName("Samsung Devices");
//        Category savedCategory = categoryRepository.save(category);
//
//        Product product4 = new Product();
//        product4.setTitle("Samsung Galaxy S22");
//        product4.setDescription("Samsung flagship phone");
//        product4.setCategory(savedCategory);
//
//        Price price4 = new Price();
//        price4.setCurrency("INR");
//        price4.setValue(80000.00);
//        //Price savedPrice4 = priceRepository.save(price4);
//
//        product4.setPrice(price4);
//        productRepository.save(product4);

//        List<Product> products = productRepository.findAllByPrice_ValueBetween(1000,30000);

//        List<Product> products = productRepository.findAllByTitleAndDescription("Iphone 12", "2021 model");
//         List<Product> products = productRepository.findAllByPrice_ValueGreaterThan(50000);
//        List<Product> products = productRepository.findAllByTitleLike("Iphone%");
//        List<Product> products = productRepository.findAllByTitle("Iphone 12");
//        for(Product product: products) {
//            System.out.println(product.getTitle());
//        }
    }

}
