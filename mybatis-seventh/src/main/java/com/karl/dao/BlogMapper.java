package com.karl.dao;

import com.karl.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author karl xie
 */
public interface BlogMapper {

    int addBook(Blog blog);

    List<Blog> getBlogIf(Map map);

    List<Blog> getBlogChoose(Map map);

    int updateBlog(Map map);

    List<Blog> getList(Map map);


}