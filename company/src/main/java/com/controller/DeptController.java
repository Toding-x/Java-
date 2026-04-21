package com.controller;

import com.entity.Dept;
import com.result.Result;
import com.service.DeptService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;
//    Controller只认接口
    @GetMapping("/list")
    public Result findAllDept( Dept dept){
        return Result.success(deptService.findAllDept(dept));
    }
    @PostMapping("/add")
    public Result insertDept(@RequestBody @Valid Dept dept){
        return Result.success(deptService.insertDept(dept));
    }
    @PutMapping("/update")
    public Result updateDeptById(@RequestBody Dept dept){
        return Result.success(deptService.updateDeptById(dept));
    }
    @DeleteMapping("{id}")
    public Result deleteDeptById(@PathVariable Integer id){
        return Result.success(deptService.deleteDeptById(id));
    }
}
