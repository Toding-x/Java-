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
    // 建议：Controller 现在直接调 Mapper 能跑通流程，适合入门。
    // 但项目再大一点，最好加一层 Service，把业务判断放中间，Controller 就会更清爽。
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
        // 小提醒：这里参数名拼成了 categroy，功能也许还能跑，但后面联调时很容易自己绕进去。
        return bookMapper.findByCategory(categroy);
    }
    @PostMapping("/add")
    public String add(Book book) {
        // 建议：如果前端是传 JSON，这里要补 @RequestBody。
        // 你可以记成一句话：POST 收对象，先想想是不是来自请求体。
        bookMapper.insert(book);
        return "add";
    }
    @DeleteMapping("/delete")
    public String delete(@RequestParam int id) {
        bookMapper.delete(id);
        return "delete";
    }
}
