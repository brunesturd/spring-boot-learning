package com.inky.boot.mybatis.mapper;

import com.inky.boot.mybatis.domain.Teacher;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class TeacherMapperTest {

    @Resource
    private TeacherMapper teacherMapper;

    @Test
    void selectAll() {
        List<Teacher> teachers = teacherMapper.selectAll();
        System.out.println(teachers);
    }


    @Test
    void deleteByPrimaryKey() {
    }

    @Test
    void insert() {
    }

    @Test
    void insertSelective() {
    }

    @Test
    void selectByPrimaryKey() {
    }

    @Test
    void updateByPrimaryKeySelective() {
    }

    @Test
    void updateByPrimaryKey() {
    }
}