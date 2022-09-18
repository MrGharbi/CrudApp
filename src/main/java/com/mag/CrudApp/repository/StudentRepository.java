package com.mag.CrudApp.repository;

import com.mag.CrudApp.Entity.Student;

import java.util.List;

public interface StudentRepository {
    int save (Student student);
    int update(Student student);
    List<Student> findAll();
}
