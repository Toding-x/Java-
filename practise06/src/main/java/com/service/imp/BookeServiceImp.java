package com.service.imp;

import com.entity.Book;
import com.mapper.BookMapper;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class BookeServiceImp implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public List<Book> findAll() {
        return  bookMapper.findAll();
    }

    @Override
    public Book findById(int id) {
        if (id<=0){
            throw new RuntimeException("输入非法id"+id);
        }
        return bookMapper.findById(id);
    }

    @Override
    public List<Book> findByCategory(String category) {
        if (category==null||category.isBlank()){
            throw new RuntimeException("分类不能为空");
        }
        return bookMapper.findByCategory(category);
    }

    @Override
    public int insert(Book book) {

        if (book.getPrice()<=0){
            throw new RuntimeException("图书价格不能小于等于0");
        }
        int result = bookMapper.insert(book);
        return result;
    }
    @Override
    public int delete( int id) {

        if (id<=0){
            throw new RuntimeException("输入非法id"+id);
        }
        int result = bookMapper.delete(id);
        return result;
    }
}
