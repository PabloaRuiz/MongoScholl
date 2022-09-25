package com.example.demo.repository;

import com.example.demo.entity.Aluno;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AlunoRepository
        extends MongoRepository<Aluno, String> {

    Optional<Aluno> findByNomeCompleto(String nome);

    Boolean existsByEmail(String email);

    List<Aluno> findByCurso_NomeIsLike(String string);
}
