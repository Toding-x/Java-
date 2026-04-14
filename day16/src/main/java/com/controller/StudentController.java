package com.controller;

import com.entity.Student;
import com.result.Result;
import com.service.StudentService;
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
        Student student = studentService.getById(id);
        if(student == null){
            return  Result.error("学生不存在");
        }
        return Result.success(student);
    }
    @PostMapping()
    public Result insert(@RequestBody Student student){
         studentService.insert(student);
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


}
