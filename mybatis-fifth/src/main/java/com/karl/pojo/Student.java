package com.karl.pojo;

import lombok.Data;

/**
 * @author karl xie
 */
@Data
public class Student {

    private int id;

    private String name;

    //学生需要关联一个老师
    private Teacher teacher;


}