package com.example.boot.basic.entity;


import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Author asus
 * @Description
 * @Date 2021/3/18
 **/

@Entity
public class Teacher {
    //id 主键
    @Id
    @GeneratedValue

    private Integer id;
    //姓名

    private String name;
    // 年龄

    private Integer age;
    //职位

    private String position;
}
