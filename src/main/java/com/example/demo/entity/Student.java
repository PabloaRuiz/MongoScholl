package com.example.demo.entity;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Document(collection="Student")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Student {

    @Id
    private String id;
    private String fullName;
    private Course course;
    private String email;

    private List<BigDecimal> grades;

    private Set<Skill> skills;
    private Address address;
}