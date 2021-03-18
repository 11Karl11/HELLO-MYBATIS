package com.karl.dao;

import com.karl.pojo.Teacher;
import com.karl.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

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

}