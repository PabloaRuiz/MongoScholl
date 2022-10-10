package com.example.demo.repository;

import com.example.demo.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository
        extends MongoRepository<Student, String> {

    Boolean existsByEmail(String email);

    List<Student> findByCourseNameLike(String course);
}