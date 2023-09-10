package com.practical.service;

import com.practical.entity.Student;
import com.practical.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository sRepo;

    public void save(Student s){
        sRepo.save(s);
    }

    public List<Student> viewStudents(){
        return sRepo.findAll();
    }

}
