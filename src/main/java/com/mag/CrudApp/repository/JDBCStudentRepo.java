package com.mag.CrudApp.repository;

import com.mag.CrudApp.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class JDBCStudentRepo implements StudentRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int save(Student student) {
        return jdbcTemplate.update("INSERT INTO testmag (user_id, firstname, lastname, email) VALUES(?,?,?,?)",
                new Object[]{UUID.randomUUID(),student.getFirstName(),student.getLastName(),student.getEmail()});
    }

    @Override
    public int update(Student student) {
        return 0;
    }

    @Override
    public List<Student> findAll() {
        return jdbcTemplate.query("SELECT * from testmag",  BeanPropertyRowMapper.newInstance(Student.class));
    }
}
