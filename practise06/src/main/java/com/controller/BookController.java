package com.controller;

import com.entity.Book;
import com.mapper.BookMapper;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookMapper bookMapper;
    @GetMapping("/list")
    public List<Book> findAll() {
        return  bookMapper.findAll();
    }
    @GetMapping("/getById")
    public Book getById(@RequestParam int id) {
        return bookMapper.findById(id);
    }
    @GetMapping("/getByCategory")
    public List<Book> getByCategory(@RequestParam String categroy) {
        return bookMapper.findByCategory(categroy);
    }
    @PostMapping("/add")
    public String add(Book book) {
        bookMapper.insert(book);
        return "add";
    }
    @DeleteMapping("/delete")
    public String delete(@RequestParam int id) {
        bookMapper.delete(id);
        return "delete";
    }
}
