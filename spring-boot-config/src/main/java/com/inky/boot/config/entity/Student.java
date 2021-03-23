package com.example.boot.basic.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author asus
 * @Description
 * @Date 2021/3/11
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer id;
    private String name;
}
