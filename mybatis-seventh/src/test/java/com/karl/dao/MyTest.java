package com.karl.dao;

import com.karl.pojo.Blog;
import com.karl.utils.IdUtils;
import com.karl.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

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
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
            mapper.addBook(new Blog(IdUtils.getId(), "Hello1", "aa1", new Date(), 991));
            mapper.addBook(new Blog(IdUtils.getId(), "Hello2", "aa2", new Date(), 992));
            mapper.addBook(new Blog(IdUtils.getId(), "Hello3", "aa3", new Date(), 993));
            mapper.addBook(new Blog(IdUtils.getId(), "Hello4", "aa4", new Date(), 994));

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
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
            HashMap map = new HashMap();
            map.put("title", "篮球");
            map.put("author", "张三");
            List<Blog> blogIf = mapper.getBlogIf(map);
            blogIf.forEach(blog -> System.out.println(blog));
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            //关闭会话
            sqlSession.close();
        }
    }

    @Test
    public void test3() {
        SqlSession sqlSession = null;
        try {
            //获取SqlSession对象
            sqlSession = MybatisUtils.getSqlSession();
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
            HashMap map = new HashMap();
            // map.put("title","篮球");
            map.put("author", "张三");
            map.put("views", 500);
            List<Blog> blogIf = mapper.getBlogChoose(map);
            blogIf.forEach(blog -> System.out.println(blog));
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            //关闭会话
            sqlSession.close();
        }
    }


    @Test
    public void test4() {
        SqlSession sqlSession = null;
        try {
            //获取SqlSession对象
            sqlSession = MybatisUtils.getSqlSession();
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
            HashMap map = new HashMap();
            // map.put("title","篮球11111");
            map.put("author", "张三11");
            // map.put("views", 500);
            map.put("id", "1d19b42200f340918175866a908c12d4");
            int i = mapper.updateBlog(map);
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            //关闭会话
            sqlSession.close();
        }
    }


    @Test
    public void test5() {
        SqlSession sqlSession = null;
        try {
            //获取SqlSession对象
            sqlSession = MybatisUtils.getSqlSession();
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
            HashMap map = new HashMap();
            ArrayList<Integer> ids = new ArrayList<>();
            ids.add(1);
            ids.add(2);
            ids.add(3);
            map.put("ids", ids);
            List<Blog> blogs = mapper.getList(map);
            blogs.forEach(blog -> System.out.println(blog));
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            //关闭会话
            sqlSession.close();
        }
    }
}

