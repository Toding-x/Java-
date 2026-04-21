package com.mapper;

import com.entity.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface LoginMapper {
    @Select("select * from emp where username = #{username}")
    Emp selectByUsername(String username);

}
