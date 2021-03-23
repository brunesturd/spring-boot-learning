package com.example.boot.basic.entity;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author asus
 * @Description
 * @Date 2021/3/11
 **/

@Slf4j
@SpringBootTest
@ExtendWith(SpringExtension.class)

class StudentTest {
    //注入Spring上下文环境
    @Resource
    private ConfigurableApplicationContext ioc;

    @Test
    public void testLoadStudent() {
        //测试Spring上下文环境中是否有Student这样一个bean，有的话表示xml配置文件生效
        boolean flag = ioc.containsBean("testBeanService");
        assertEquals(true, flag);
        Student student = (Student) ioc.getBean("student");
        Student expectedStudent = Student.builder().id(123).name("tom").build();
        assertEquals(expectedStudent,student);
    }

}