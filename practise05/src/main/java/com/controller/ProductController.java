package com.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @GetMapping("/list")
    public String list() {
        return String.format("商品列表");
    }
    @GetMapping("/find")
    public String find(@RequestParam int id) {
        return "查询商品,id = " + id;
    }
    @GetMapping("/{id}/detail")
    public String detail(@PathVariable Integer id) {
        return "商品详情，id="+id;
    }


}
