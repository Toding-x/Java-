package com.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/info")
    public String info() {
        return "这是用户信息";
    }
    @GetMapping("/find")
    public String find(@RequestParam Integer id) {
        return "查询用户，ID为:"+id;
    }
    @GetMapping("/{id}")
    public String getId(@PathVariable Integer id) {
        return "路径用户ID:"+id;
    }
}
