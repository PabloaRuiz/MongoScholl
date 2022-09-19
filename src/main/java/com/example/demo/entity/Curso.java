package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Curso")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Curso {

    @Id
    @JsonIgnore
    private String id;
    private String nome;
}
