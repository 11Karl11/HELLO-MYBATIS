package com.karl.dao;

import com.karl.pojo.User;
import com.karl.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

/**
 * @author karl xie
 */
public class UserDaoTest {

    static Logger logger = Logger.getLogger(UserDaoTest.class);


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
    public void getUserByLimit(){

        SqlSession sqlSession = null;
        try {
            //获取SqlSession对象
            sqlSession = MybatisUtils.getSqlSession();
            //执行SQL
            UserMapper userDao = sqlSession.getMapper(UserMapper.class);

            HashMap<String, Integer> map = new HashMap<>();
            map.put("startIndex",0);
            map.put("pageSize",2);
            List<User> userList = userDao.getUserByLimit(map);

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


}