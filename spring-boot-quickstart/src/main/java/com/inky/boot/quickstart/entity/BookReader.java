package com.example.boot.basic.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author asus
 * @Description 读者
 * @Date 2021/3/4
 **/

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookReader {
    private  String name;
    private  Integer age;
}
