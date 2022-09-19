package com.example.demo.repository;

import com.example.demo.entity.Habilidade;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadeRepository extends MongoRepository<Habilidade, String> {
}
