package com.karl.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author karl xie
 */
@Data
public class User implements Serializable {
    private int id;
    private String name;
    private String pwd;
}