package com.karl.dao;

import com.karl.pojo.Teacher;
import com.karl.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author karl xie
 * Created on 2021-03-18 14:55
 */
public class MyTest {

    @Test
    public void test1(){
        SqlSession sqlSession = null;
        try {
            //获取SqlSession对象
            sqlSession = MybatisUtils.getSqlSession();
            TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
            List<Teacher> teachers = mapper.getTeacher();
            teachers.forEach(teacher -> System.out.println(teacher));
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            //关闭会话
            sqlSession.close();
        }
    }

    @Test
    public void test2(){
        SqlSession sqlSession = null;
        try {
            //获取SqlSession对象
            sqlSession = MybatisUtils.getSqlSession();
            TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
            System.out.println(mapper.getTeacher1(1));

        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            //关闭会话
            sqlSession.close();
        }
    }

    @Test
    public void test3(){
        SqlSession sqlSession = null;
        try {
            //获取SqlSession对象
            sqlSession = MybatisUtils.getSqlSession();
            TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
            System.out.println(mapper.getTeacher2(1));

        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            //关闭会话
            sqlSession.close();
        }
    }



}