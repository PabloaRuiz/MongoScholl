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


    public BigDecimal getAvgGrades() {
        var size = getGrades().stream().count();
        var grade = getGrades().stream().map(
                e -> e.add(e)).toList();

        return grade.get(0).divide(BigDecimal.valueOf(size));
    }
}