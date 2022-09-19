package com.example.demo.service;

import com.example.demo.entity.Aluno;
import com.example.demo.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;

    public List<Aluno> getAlunos() {
       return repository.findAll();
    }

    public Optional<Aluno> getAlunoNome(String nome) {
        return repository.findByNome(nome);
    }
}
