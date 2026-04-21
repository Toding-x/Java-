package com.mapper;

import com.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {
    List<Dept> findAllDept(Dept dept);
    int insertDept(Dept dept);
    int updateDeptById(Dept dept);
    int deleteDeptById(Integer id);

}
