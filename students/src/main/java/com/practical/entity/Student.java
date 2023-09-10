package com.practical.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String studentid;
    private String name;
    private int ca;
    private int practical;
    private int theory;

    public Student(int id, String studentid, String name, int ca, int practical, int theory) {
        this.id = id;
        this.studentid = studentid;
        this.name = name;
        this.ca = ca;
        this.practical = practical;
        this.theory = theory;
    }

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCa() {
        return ca;
    }

    public void setCa(int ca) {
        this.ca = ca;
    }

    public int getPractical() {
        return practical;
    }

    public void setPractical(int practical) {
        this.practical = practical;
    }

    public int getTheory() {
        return theory;
    }

    public void setTheory(int theory) {
        this.theory = theory;
    }
}
