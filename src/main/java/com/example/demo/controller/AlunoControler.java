package com.example.demo.controller;


import com.example.demo.entity.Aluno;
import com.example.demo.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.HttpStatus.OK;


@RestController
@RequestMapping("/api/v1/escola")
public class AlunoControler {

    @Autowired
    private AlunoService service;


    @GetMapping("/alunos")
    @ResponseStatus(OK)
    public List<Aluno> getAll() {
       return service.getAlunos();
    }

    @GetMapping("/aluno/{nome}")
    @ResponseStatus(OK)
    public Optional<Aluno> getByAlunoNome(@PathVariable String nome) {
        return service.getAlunoNome(nome);
    }

}
