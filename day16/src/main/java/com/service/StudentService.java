package com.service;

import com.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAll();
    Student getById(int id);
    int insert(Student student);
    int delete(int id);
    int update(Student student);
}
