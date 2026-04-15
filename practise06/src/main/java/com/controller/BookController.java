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
    // 给你的练习任务：先不用马上重构 Service，但你要先能说清楚 Controller、Service、Mapper 各自负责什么。
//    Controller 是用来控制访问的地址，service是用来执行业务功能的，mapper是用来执行sql语句的具体到CRUD
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
    public List<Book> getByCategory(@RequestParam String category) {
        // TODO（优先级2）：先把这个拼写修掉，再自己测一遍请求参数绑定。
        // 完成标准：参数名统一成 category，并能解释清楚前端传参名为什么要和后端接收名对应。
        // 小提醒：这里参数名拼成了 categroy，功能也许还能跑，但后面联调时很容易自己绕进去。
        // 给你的练习任务：把参数名修正后，用浏览器或 Postman 自己测一遍，确认请求参数名和方法参数名是怎么对应上的。
        return bookMapper.findByCategory(category);
    }

    @PostMapping("/add")
    public String add(@RequestBody Book book) {
        // TODO（优先级1）：先把这里的 JSON 接收方式彻底吃透，重点就是 @RequestBody。
        // 完成标准：你能分别说清楚表单提交、URL 参数、JSON 请求体各自怎么接。
//        表单提交使用@RequestParam,url参数是使用@PathVarich,json请求是使用@RequsetBody来传数据的
        // 建议：如果前端是传 JSON，这里要补 @RequestBody。
        // 你可以记成一句话：POST 收对象，先想想是不是来自请求体。
        // 给你的练习任务：自己分别试一次“表单提交”和“JSON 提交”，感受一下不用 @RequestBody 和用了 @RequestBody 的区别。
        // 想一想：后端参数接不到时，你第一步该查请求方式、参数位置，还是先怀疑 SQL？
//       我觉得第一步先检查请求方式，先检查最简单的
        bookMapper.insert(book);
        return "add";
    }
    @DeleteMapping("/delete")
    public String delete(@RequestParam int id) {
        bookMapper.delete(id);
        return "delete";
    }
}



