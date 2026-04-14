package com.mapper;

import com.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
//@mapper是用来定义接口，使用后不需要创建imp来实现
public interface UserMapper {
    @Select("select * from user")
//@select 直接输入sql语句
    List<User> findAll();
//把读取的数据打包
    @Select("select * from user where id = #{id}")
    User findById(int id);

}
