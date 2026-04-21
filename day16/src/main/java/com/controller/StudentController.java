package com.controller;

import com.dto.StudentDto;
import com.entity.Student;
import com.result.Result;
import com.service.StudentService;
import com.vo.StudentVo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping()
    public Result getAll(){
        return Result.success(studentService.getAll());

    };
    @GetMapping("/{id}")
    public Result getById(@PathVariable int id){
        StudentVo vo = studentService.getById(id);
        if(vo == null){
            return  Result.error("学生不存在");
        }
        return Result.success(vo);
    }
    @PostMapping()
    public Result insert(@Valid @RequestBody StudentDto dto){
         studentService.insert(dto);
        return Result.success();
    }
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable int id){
        studentService.delete(id);
        return Result.success();
    }
    @PutMapping("/{id}")
    public Result update(
            @PathVariable int id,@RequestBody Student student
    ){
        student.setId(id);
        studentService.update(student);
        return Result.success();
    }
    @GetMapping("/page")
    public Result getPage(@RequestParam int pageNum,int pageSize){

        return Result.success(studentService.getByPage(pageNum,pageSize));
    }


}
