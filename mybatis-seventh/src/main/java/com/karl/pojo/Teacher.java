package com.karl.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author karl xie
 */
@Data
public class Teacher {

    private int id;

    private String name;

    private List<Student> students;

}