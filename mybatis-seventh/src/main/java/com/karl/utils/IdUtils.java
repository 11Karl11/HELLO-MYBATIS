package com.karl.utils;

import java.util.UUID;

/**
 * @author karl xie
 */
public class IdUtils {

    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

}