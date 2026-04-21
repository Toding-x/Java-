package com.service;

import com.dto.StudentDto;
import com.entity.PageResult;
import com.entity.Student;
import com.vo.StudentVo;

import java.util.List;

public interface StudentService {
    List<Student> getAll();
    StudentVo getById(int id);
    int insert(StudentDto dto);
    int delete(int id);
    int update(Student student);
    PageResult getByPage(int pageNum,int pageSize);
}
