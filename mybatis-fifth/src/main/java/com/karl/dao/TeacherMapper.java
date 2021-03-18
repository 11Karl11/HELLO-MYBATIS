package com.karl.dao;

import com.karl.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author karl xie
 */
public interface TeacherMapper {

    // @Select("select * from teacher where id =#{tid}")
    Teacher getTeacher(@Param("tid") int id);
}
