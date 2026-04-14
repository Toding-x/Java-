package com.controller;

import com.entity.User;
import com.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
