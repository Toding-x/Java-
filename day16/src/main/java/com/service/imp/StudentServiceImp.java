package com.service.imp;

import com.dto.StudentDto;
import com.entity.PageResult;
import com.entity.Student;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mapper.StudentMapper;
import com.service.StudentService;
import com.vo.StudentVo;
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
    public StudentVo getById(int id) {
        Student student = studentMapper.getById(id);
        StudentVo vo = new StudentVo();
        vo.setId(student.getId());
        vo.setName(student.getName());
        return vo;
    }

    @Override
    public int insert(StudentDto dto) {
        Student student = new Student();
        student.setName(dto.getName());
        student.setGender(dto.getGender());
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

    @Override
    public PageResult getByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Student> list =studentMapper.getAll();
        PageInfo<Student> pageInfo = new PageInfo<>(list);
        return new  PageResult(pageInfo.getTotal(),pageInfo.getList());
    }
}

