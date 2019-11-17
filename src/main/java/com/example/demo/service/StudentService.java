package com.example.demo.service;

import com.example.demo.mapper.StudentMapper;
import com.example.demo.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;


    public List<Student> selectStudents() {
        List<Student> students = studentMapper.selectStudents();
        return students;
    }
}
