package com.karl.dao;

import com.karl.pojo.User;
import com.karl.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author karl xie
 * Created on 2021-03-18 14:55
 */
public class MyTest {

    @Test
    public void test1() {
        SqlSession sqlSession = null;
        try {
            //获取SqlSession对象
            sqlSession = MybatisUtils.getSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User user = mapper.getUserById(1);
            System.out.println(user);

            System.out.println("---------------------------");
            // sqlSession.clearCache();

            User user1 = mapper.getUserById(1);
            System.out.println(user1);

            System.out.println(user==user1);
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            //关闭会话
            sqlSession.close();
        }
    }



    @Test
    public void test2() {
            //获取SqlSession对象
            SqlSession sqlSession = MybatisUtils.getSqlSession();
            SqlSession sqlSession2 = MybatisUtils.getSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
            User user = mapper.getUserById(1);
            System.out.println(user);
            sqlSession.close();
            System.out.println("---------------------------");

            User user1 = mapper2.getUserById(1);
            System.out.println(user1);
            sqlSession2.close();
            System.out.println(user==user1);
    }

}

