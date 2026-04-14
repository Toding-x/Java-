package com.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {
@GetMapping("/info")
    public String info() {
    return "图书信息页面";
}
@GetMapping("/get")
    public String get(@RequestParam Integer id) {
    return "获取图书ID:"+id;
}
@GetMapping("/{id}")
    public String find(@PathVariable Integer id) {
    return "路径图书ID:"+id;
}
}
