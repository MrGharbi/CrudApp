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

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/student")
    public List<Student> getAll(){
        return studentRepository.findAll();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student){
        studentRepository.save(student);
        return student;
    }

    @GetMapping("student/{firstName}")
    public List<Student> getStudent(@RequestParam String firstName){
        return studentRepository.findByFirstname(firstName);
    }
}
