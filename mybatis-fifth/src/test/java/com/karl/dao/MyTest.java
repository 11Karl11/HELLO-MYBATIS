package com.karl.dao;

import com.karl.pojo.Student;
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
            Teacher teacher = mapper.getTeacher(1);
            System.out.println(teacher);
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

            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            List<Student> students = mapper.getStudent();
            students.forEach(student -> System.out.println(student));
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

            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            List<Student> students = mapper.getStudent2();
            students.forEach(student -> System.out.println(student));
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            //关闭会话
            sqlSession.close();
        }
    }

}