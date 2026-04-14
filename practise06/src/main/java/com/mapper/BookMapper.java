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
    @Insert("insert into book values (#{id},#{title},#{author},#{price},#{category})")
    int insert(Book book);
    @Delete("delete from book where id=#{id}")
    int delete(int id);

}
