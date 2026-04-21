package com.service.imp;

import com.dto.EmpDto;
import com.dto.EmpQueryDto;
import com.entity.Emp;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mapper.EmpMapper;
import com.utils.MD5Utils;
import com.vo.EmpVo;
import com.vo.PageResult;
import com.service.EmpService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Service
public class EmpServiceImp implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public int updateByDeptId(Integer id) {
        return empMapper.updateByDeptId(id);
    }

    @Override
    public PageResult getPage(EmpQueryDto empQueryDto) {
//        使用PageHelper.starPage来自动分页
        PageHelper.startPage(empQueryDto.getPage(),empQueryDto.getPageSize());
        List<Emp> list = empMapper.findEmp(empQueryDto);
        PageInfo<Emp> pageInfo = new PageInfo<>(list);
        List<EmpVo> voList = new ArrayList<>();
        for (Emp emp : list){
            EmpVo vo = new EmpVo();
            BeanUtils.copyProperties(emp,vo);
            voList.add(vo);
        };
//       把结果分页，通过getTotle获取页数，getList获取每页的数据

        return new  PageResult(pageInfo.getTotal(),voList);
    }

    @Override
    public EmpVo findEmp(Integer gender) {
        EmpQueryDto empQueryDto = new EmpQueryDto();
        empQueryDto.setGender(gender);
        List<Emp> list = empMapper.findEmp(empQueryDto);
     EmpVo empVo = new EmpVo();
     if(list.isEmpty())return null;
     BeanUtils.copyProperties(list.get(0),empVo);
     return empVo;
    }

    @Override
    public int addEmp(EmpDto empDto) {
        if (empDto.getPassword() ==null|| empDto.getPassword().isBlank()){
            empDto.setPassword(MD5Utils.encrypt("123456"));
        }
        Emp emp = new Emp();
        BeanUtils.copyProperties(empDto,emp);
        emp.setCreateTime(LocalDateTime.now());
        return empMapper.addEmp(emp);
    }

    @Override
    public int updateDmp(EmpDto empDto) {
        Emp emp = new Emp();
        BeanUtils.copyProperties(empDto,emp);
        emp.setPassword(null);
        return empMapper.updateEmp(emp);
    }

    @Override
    public int deleteEmp(List<Integer> ids) {
        return empMapper.deleteEmp(ids);
    }

    @Override
    public EmpVo findEmpById(Integer id) {
        EmpVo empVo = new EmpVo();
        BeanUtils.copyProperties(empMapper.findEmpById(id),empVo);
        return empVo;
    }

}
