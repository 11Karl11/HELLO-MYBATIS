package com.karl.dao;

import com.karl.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author karl xie
 */
public interface TeacherMapper {

    List<Teacher> getTeacher();

    //获取指定老师及所有老师的学生

    Teacher getTeacher1(@Param("tid")int tid);

    Teacher  getTeacher2(@Param("tid")int tid);

}
