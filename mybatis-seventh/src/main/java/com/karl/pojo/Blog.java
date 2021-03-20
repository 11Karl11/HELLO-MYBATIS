package com.karl.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author karl xie
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Blog {

    private String  id;

    private String title;

    private String author;

    private Date createTime; //需求开启驼峰

    private int views;
}