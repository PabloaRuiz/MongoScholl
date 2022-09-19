package com.example.demo.repository;

import com.example.demo.entity.Aluno;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AlunoRepository
        extends MongoRepository<Aluno, String> {


    Optional<Aluno> findByNome(String name);

}
