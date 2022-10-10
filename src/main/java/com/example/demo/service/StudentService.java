package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.exception.ExceptionEmail;
import com.example.demo.exception.ExceptionStudent;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;


    public Student createStudent(Student aluno) throws ExceptionEmail {
        if (! repository.existsByEmail(aluno.getEmail())){
            return aluno;
        }
        throw new ExceptionEmail();
    }

    public List<Student> listStudents() {
        return repository.findAll();
    }

    public Optional<Student> studentId(String id) {
        return repository.findById(id);
    }

    public List<Student> studentListByCourse(String course) {
        return repository.findByCourseNameLike(course);
    }

    public void deleteStudent(String id) throws ExceptionStudent {
        if (studentId(id).isEmpty()) {
            throw new ExceptionStudent();
        }
        repository.deleteById(id);
    }
}
