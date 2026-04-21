package com.controller;

import com.dto.EmpDto;
import com.dto.EmpQueryDto;
import com.result.Result;
import com.service.EmpService;
import io.swagger.v3.oas.models.security.SecurityScheme;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpService empService;
    @GetMapping("/list")
    public Result getPage(EmpQueryDto empQueryDto){
        return Result.success(empService.getPage(empQueryDto));
    }
//    关于分页编写部分还是有点不熟，在用List<Emp>来装数据，使用Bean来自动把Emp自动写入EmpVo里面，使用Page
    @PostMapping("/add")
    public Result addEmp(@RequestBody @Valid EmpDto empDto){
        return Result.success(empService.addEmp(empDto));
    }
    @PutMapping("/update")
    public Result updateDmp(@RequestBody @Valid EmpDto empDto){
        return Result.success(empService.updateDmp(empDto));
    }
    @DeleteMapping()
    public Result deleteEmp(@RequestParam List<Integer> ids){
        return Result.success(empService.deleteEmp(ids));
    }
    @GetMapping("/{id}")
    public Result findEmpById(@PathVariable Integer id){
        return Result.success(empService.findEmpById(id));
    }
}
