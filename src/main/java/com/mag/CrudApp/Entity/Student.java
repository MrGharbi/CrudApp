package com.mag.CrudApp.Entity;

import org.springframework.data.annotation.Id;

import java.util.UUID;

public class Student {

    @Id
    private UUID user_id;
    private String firstName;
    private String lastName;
    private  String email;

    public Student() {
    }

    public Student(UUID user_id, String firstName, String lastName, String email) {
        this.user_id = user_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public UUID getId() {
        return user_id;
    }

    public void setId(UUID user_id) {
        this.user_id = user_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
