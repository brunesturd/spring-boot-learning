package com.example.boot.basic;

/**
 * @Author asus
 * @Description
 * @Date 2021/3/9
 **/
public class TestString {
    public static void main(String[] args) {
        String name = "111.111.jpg";
        int index = name.lastIndexOf(".");
        System.out.println(index);
        System.out.println(name.substring(index));

    }
}
