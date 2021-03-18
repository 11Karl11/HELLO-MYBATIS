package com.karl.dao;

import com.karl.pojo.User;
import com.karl.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author karl xie
 */
public class UserDaoTest {


    @Test
    public void test() {
        SqlSession sqlSession = null;

        try {
            //获取SqlSession对象
            sqlSession = MybatisUtils.getSqlSession();
            //执行SQL
            UserMapper userDao = sqlSession.getMapper(UserMapper.class);

            List<User> userList = userDao.getUserList();

            for (User user : userList) {
                System.out.println(user);
            }
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            //关闭会话
            sqlSession.close();
        }

    }


    @Test
    public void test1() {
        SqlSession sqlSession = null;

        try {
            //获取SqlSession对象
            sqlSession = MybatisUtils.getSqlSession();
            //执行SQL
            UserMapper userDao = sqlSession.getMapper(UserMapper.class);

            User user = userDao.getUserById(2);

            System.out.println(user);

        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            //关闭会话
            sqlSession.close();
        }

    }

    @Test
    public void test2() {
        SqlSession sqlSession = null;

        try {
            //获取SqlSession对象
            sqlSession = MybatisUtils.getSqlSession();
            //执行SQL
            UserMapper userDao = sqlSession.getMapper(UserMapper.class);

            userDao.addUser(new User(9,"ghhah哈哈","0000"));


        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            //关闭会话
            sqlSession.close();
        }

    }


}