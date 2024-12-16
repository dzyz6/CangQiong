package com.example.demo4.mapper;

import com.example.demo4.enity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface StudentMapper {
   Student findAllStudent();
}
