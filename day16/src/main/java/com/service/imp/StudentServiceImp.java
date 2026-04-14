package com.service.imp;

import com.entity.Student;
import com.mapper.StudentMapper;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {
    @Autowired
    private StudentMapper studentMapper;


    @Override
    public List<Student> getAll() {
        return studentMapper.getAll();
    }
    @Override
    public Student getById(int id) {
        return studentMapper.getById(id);
    }

    @Override
    public int insert(Student student) {
        return studentMapper.insert(student);
    }

    @Override
    public int delete(int id) {
        return studentMapper.delete(id);
    }

    @Override
    public int update(Student student) {
        return studentMapper.update(student);
    }
}

