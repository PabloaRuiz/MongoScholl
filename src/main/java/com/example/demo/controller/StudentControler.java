package com.example.demo.controller;


import com.example.demo.entity.Student;
import com.example.demo.exception.ExceptionEmail;
import com.example.demo.exception.ExceptionStudent;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.HttpStatus.*;


@RestController
@RequestMapping("/api/v1/school")
public class StudentControler {

    @Autowired
    private StudentService service;

    @PostMapping("/student")
    @ResponseStatus(CREATED)
    public Student postAluno(@RequestBody Student student) throws ExceptionEmail {
          return service.createStudent(student);
    }

    @GetMapping("/student/{id}")
    @ResponseStatus(OK)
    public Optional<Student> listStudents(@PathVariable String id){
        return service.studentId(id);
    }

    @GetMapping("/students")
    @ResponseStatus(OK)
    public List<Student> listStudents(){
        return service.listStudents();
    }

    @GetMapping("/students/course/{course}")
    @ResponseStatus(OK)
    public List<Student> listStudentsByCourse(@PathVariable String course){
        return service.studentListByCourse(course);
    }

    @DeleteMapping("/student/{id}")
    @ResponseStatus(OK)
    public void deleteStudent(@PathVariable String id) throws ExceptionStudent {
        service.deleteStudent(id);
    }



}
