package com.example.demo.entity;

import com.example.demo.entity.Enum.Nivel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Habilidade")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Habilidade {

    @Id
    @JsonIgnore
    private String id;
    private String habilidade;
    private Nivel nivel;
}
