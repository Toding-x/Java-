package com.mapper;

import com.entity.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookMapper {
    @Select("select * from book")
    List<Book> findAll();
    @Select("select * from book where id=#{id}")
    Book findById(int id);
    @Select("select * from book where category=#{category}")
    List<Book> findByCategory(String category);
    // 建议：insert 最好把字段名写全，别直接 values(...) 全靠表字段顺序。
    // 现在练习库问题不大，但真实项目里一改表结构，这种写法最容易埋雷。
    // 给你的练习任务：把 SQL 改成 insert into book(id, title, author, price, category) values (...)
    // 再想一想：为什么 insert / delete 返回 int，而不是直接写 void？这个返回值能帮你做什么判断？
//    能够帮我判断是否做了删除或者添加，是用来查看数据行数的
    @Insert("insert into book(id,title,author,price,category) values (#{id},#{title},#{author},#{price},#{category})")
    int insert(Book book);
    @Delete("delete from book where id=#{id}")
    int delete(int id);

}

