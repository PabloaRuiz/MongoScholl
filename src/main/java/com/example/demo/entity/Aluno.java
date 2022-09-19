package com.example.demo.entity;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Set;

@Document(collection="Aluno")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Aluno {

    @Id
    private String id;
    private String nome;
    private Curso curso;

    private List<Nota> notas;

    private Set<Habilidade> habilidades;
    private Endereco endereco;
}
