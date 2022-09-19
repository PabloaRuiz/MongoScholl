package com.example.demo.repository;

import com.example.demo.entity.Nota;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaRepository extends MongoRepository<Nota, String> {
}
