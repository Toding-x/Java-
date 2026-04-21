package com.service;

import com.entity.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> findAllDept(Dept dept);
    int insertDept(Dept dept);
    int updateDeptById(Dept dept);
    int deleteDeptById(Integer id);
}
