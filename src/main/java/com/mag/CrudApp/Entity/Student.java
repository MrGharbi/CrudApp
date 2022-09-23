package com.mag.CrudApp.Entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name= "testmag")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID user_id;
    private String firstname;
    private String lastname;
    private  String email;

    public Student() {
    }

    public Student(UUID user_id, String firstname, String lastname, String email) {
        this.user_id = user_id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    public UUID getId() {
        return user_id;
    }

    public void setId(UUID user_id) {
        this.user_id = user_id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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
                ", firstName='" + firstname + '\'' +
                ", lastName='" + lastname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
