package com.example.demo.dto;

import com.example.demo.entity.Address;
import com.example.demo.entity.Course;
import com.example.demo.entity.Skill;
import com.example.demo.entity.Student;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.Set;


@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

    private String id;

    @JsonProperty("Name")
    private String fullName;

    @JsonProperty("E-mail")
    private String email;

    @JsonProperty("Address")
    private Address address;

    @JsonProperty("Skills")
    private Set<Skill> skills;

    @JsonProperty("Course")
    private Course course;

    @JsonProperty("Grades")
    private List<BigDecimal> grades;

    @JsonProperty("Average")
    private BigDecimal avgGrade;


    public StudentDto convertStudent(Student student) {
        return StudentDto.builder()
                .id(student.getId())
                .fullName(student.getFullName())
                .email(student.getEmail())
                .address(student.getAddress())
                .skills(student.getSkills())
                .course(student.getCourse())
                .grades(student.getGrades())
                .avgGrade(student.getAvgGrades())
                .build();
    }

    public StudentDto convertStudentOptional(Optional<Student> student) {
        return StudentDto.builder()
                .id(student.get().getId())
                .fullName(student.get().getFullName())
                .email(student.get().getEmail())
                .address(student.get().getAddress())
                .skills(student.get().getSkills())
                .course(student.get().getCourse())
                .grades(student.get().getGrades())
                .avgGrade(student.get().getAvgGrades())
                .build();
    }




}