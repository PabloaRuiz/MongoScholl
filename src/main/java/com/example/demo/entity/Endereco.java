package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(collection="Endereco")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Endereco{

    @Id
    @JsonIgnore
    private String id;
    private String rua;
    private String cidade;
    private String estado;
    private BigDecimal lat;
    private BigDecimal log;
}
