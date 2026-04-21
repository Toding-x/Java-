package com.mapper;


import com.dto.EmpQueryDto;
import com.entity.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//mapper里面封装数据只能使用entity里面的封装
@Mapper
public interface EmpMapper {
    int updateByDeptId(Integer id);
    List<Emp> findEmp(EmpQueryDto empQueryDto);
    int addEmp(Emp emp);
    int updateEmp(Emp emp);
    int deleteEmp(List<Integer> ids);
    Emp findEmpById(Integer id);


}
