package com.service;

import com.entity.Book;


import java.util.List;

public interface BookService  {
    List<Book>findAll();
    Book findById(int id);
    List<Book> findByCategory(String category);
    int insert(Book book);
    int delete(int id);
}
