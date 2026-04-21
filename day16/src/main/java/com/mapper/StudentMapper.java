package com.mapper;

import com.entity.Student;
import org.apache.ibatis.annotations.*;


import java.util.List;

@Mapper
public interface StudentMapper {
    @Select("select * from student")
    List<Student> getAll();
    @Select("select * from student where id=#{id}")
    Student getById(int id);
    @Insert("insert into student(name,gender) values (#{name},#{gender})")
    int insert(Student student);
    @Delete("delete from student where id=#{id}")
    int delete(int id);
    @Update("update student set id=#{id},name=#{name},age=#{age},gender=#{gender},classroom=#{classroom},address=#{address} where id = #{id} ")
    int update(Student student );
}
