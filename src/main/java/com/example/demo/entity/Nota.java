package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(collection="Nota")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Nota {

    @Id
    @JsonIgnore
    private String id;
    private BigDecimal nota;
}
