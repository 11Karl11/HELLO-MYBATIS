package com.karl.dao;

import com.karl.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author karl xie
 */
public interface UserMapper {


    @Select("select * from user")
    List<User> getUserList();


    @Select("select * from user where id =#{id}")
    User getUserById(@Param("id") int id);

    @Insert("insert into user (id,name,pwd) values (#{id},#{name},#{password})")
    int addUser(User user);


}