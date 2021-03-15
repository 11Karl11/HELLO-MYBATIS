package com.karl.dao;

import com.karl.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author karl xie
 */
public interface UserMapper {


    List<User> getUserList();

    User getUserById(int id);

    List<User> getUserLike(String value);

    User getUserById2(Map<String,Object> map);

    int addUser(User user);

    int addUser2(Map<String,Object> map);

    int updateUser(User user);

    int deleteUser(int id);


}