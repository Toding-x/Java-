package com.controller;

import com.entity.User;
import com.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @GetMapping("/list")
    public List<User> findAll() {
        return userMapper.findAll();
    }
    @GetMapping("/getById")
    public User findById(int id) {
        return userMapper.findById(id);
    }
    @GetMapping("/search")
    public List<User> search(String name,Integer age){
        return userMapper.findByCondition(name,age);
    }
    @DeleteMapping("/batch")
    public int deleteByIds(@RequestParam List<Integer> ids){
        return userMapper.deleteByIds(ids);
    }
    @PutMapping("/update")
    public int update(@RequestBody User user){
        return userMapper.updateSelective(user);
    }
    @PostMapping("/add")
    public int addUser(@RequestBody User user){
        return userMapper.addUser(user);
    }
}
