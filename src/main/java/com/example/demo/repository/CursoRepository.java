package com.example.demo.repository;

import com.example.demo.entity.Course;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository
        extends MongoRepository<Course, String> {
}
