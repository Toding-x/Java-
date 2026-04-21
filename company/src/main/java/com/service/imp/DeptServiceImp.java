package com.service.imp;

import com.entity.Dept;
import com.mapper.DeptMapper;
import com.mapper.EmpMapper;
import com.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeptServiceImp implements DeptService {
    @Autowired
    private DeptMapper deptMapper;
    @Autowired
    private EmpMapper empMapper;
    @Override
    public List<Dept> findAllDept(Dept dept) {
        return deptMapper.findAllDept(dept);
    }

    @Override
    public int insertDept(Dept dept) {
        dept.setCreateTime(LocalDateTime.now());
        return deptMapper.insertDept(dept);
    }

    @Override
    public int updateDeptById(Dept dept ) {
        return deptMapper.updateDeptById(dept);
    }

    @Override
    public int deleteDeptById(Integer id) {
        empMapper.updateByDeptId(id);
        return deptMapper.deleteDeptById(id);
    }
}
