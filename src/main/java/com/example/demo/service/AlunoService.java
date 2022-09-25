package com.example.demo.service;

import com.example.demo.entity.Aluno;
import com.example.demo.exception.ExceptionEmail;
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
        return repository.findByNomeCompleto(nome);
    }

    public List<Aluno> getAlunoCurso(String curso) {
        return repository.findByCurso_NomeIsLike(curso);
    }

    public Aluno createAluno(Aluno aluno) throws ExceptionEmail {
        if (repository.existsByEmail(aluno.getEmail()).equals(false)){
            return aluno;
        }
        throw new ExceptionEmail();
    }
}
