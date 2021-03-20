package com.karl.dao;

import com.karl.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

/**
 * @author karl xie
 */
public interface TeacherMapper {

    Teacher getTeacher(@Param("tid") int id);
}
