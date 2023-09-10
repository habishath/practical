package com.practical.controller;

import com.practical.entity.Student;
import com.practical.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/")
    public String studentRegistration(){
        return "StudentRegistration";
    }
    @GetMapping("/view_marks")
    public ModelAndView viewStudents(){
        List<Student> list = service.viewStudents();
        return new ModelAndView("viewMarks","student",list);
    }

    @PostMapping("/save")
    public String addStudent(@ModelAttribute Student s){
        service.save(s);
        return "redirect:/view_marks";
    }
}
