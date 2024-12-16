package com.example.demo4.service;


import com.example.demo4.enity.Student;
import com.example.demo4.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public Student findAllStudent(){
        return studentMapper.findAllStudent();
    }
}
