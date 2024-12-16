package com.example.demo4.controller;

import com.example.demo4.enity.Student;
import com.example.demo4.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student")
    public Student getStudent(){
        return studentService.findAllStudent();
    }

}
