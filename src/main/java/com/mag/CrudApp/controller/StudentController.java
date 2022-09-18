package com.mag.CrudApp.controller;

import com.mag.CrudApp.Entity.Student;
import com.mag.CrudApp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/student")
    public List<Student> getAll(){
        return studentRepository.findAll();
    }

    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student){
        studentRepository.save(student);
        return student;
    }
}
