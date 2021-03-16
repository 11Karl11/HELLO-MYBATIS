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

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

    List<User> getUserByLimit(Map<String,Integer> map);

    List<User> getUserByRowBounds();


}