package com.karl.dao;

import com.karl.pojo.User;
import com.karl.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
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
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭会话
            sqlSession.close();
        }

    }

    @Test
    public void test2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.getUserById(1));
        sqlSession.close();
    }

    //增删改需要提交事务
    @Test
    public void test3() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        System.out.println(mapper.addUser(new User(4, "哈哈哈", "1111")));

        //提交事务
        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void test4() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        System.out.println(mapper.updateUser(new User(4, "哈哈哈11", "11113")));

        //提交事务
        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void test5() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        System.out.println(mapper.deleteUser(1));

        //提交事务
        sqlSession.commit();

        sqlSession.close();
    }


    @Test
    public void test6() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("userid",5);
        map.put("name","99的");
        map.put("password","111111233");
        mapper.addUser2(map);

        //提交事务
        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void test7() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("userid",5);
        map.put("name","99的");
        User user = mapper.getUserById2(map);
        System.out.println(user);

        //提交事务
        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void test8() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // List users = mapper.getUserLike("%李%");
        List users = mapper.getUserLike("李");
        users.forEach(user-> System.out.println(user));
        sqlSession.close();
    }


}