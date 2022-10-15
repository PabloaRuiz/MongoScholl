package com.example.demo.controller;


import com.example.demo.dto.StudentDto;
import com.example.demo.entity.Student;
import com.example.demo.exception.ExceptionEmail;
import com.example.demo.exception.ExceptionStudent;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

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
    public Optional<StudentDto> listStudents(@PathVariable String id){
        Optional<Student> student = service.studentId(id);
        StudentDto studentDto = new StudentDto().convertStudentOptional(student);
        return Optional.ofNullable(studentDto);
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

    @PutMapping("/student/{id}")
    @ResponseStatus(OK)
    public StudentDto updateStudent(Student student) throws ExceptionStudent {
       Student st = service.update(student);
       StudentDto studentDto = new StudentDto().convertStudent(st);

       return studentDto;
    }



}
