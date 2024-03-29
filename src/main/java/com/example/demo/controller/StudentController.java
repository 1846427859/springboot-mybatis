package com.example.demo.controller;

import com.example.demo.pojo.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {


    @Autowired
    private StudentService studentService;

    @RequestMapping("/selectStudents")
    public List<Student> selectStudents() {
        List<Student> list = studentService.selectStudents();
        return list;
    }
}
