package com.service;


import com.dto.EmpDto;
import com.dto.EmpQueryDto;
import com.entity.Emp;
import com.vo.EmpVo;
import com.vo.PageResult;
import io.swagger.v3.oas.models.security.SecurityScheme;

import java.util.List;

public interface EmpService {
    int updateByDeptId(Integer id);
    PageResult getPage(EmpQueryDto empQueryDto);
//    使用PageResult来收集结果，PageResult里面封装的时有多少页和每页有多少数据
    EmpVo findEmp(Integer gender);
    int addEmp(EmpDto empDto);
    int updateDmp(EmpDto empDto);
    int deleteEmp(List<Integer> ids);
    EmpVo findEmpById(Integer id);

}
