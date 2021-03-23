package com.example.boot.basic.service;

import com.example.boot.basic.entity.Teacher;

import java.util.List;

/**
 * @Author asus
 * @Description
 * @Date 2021/3/18
 **/
public interface TeacherService {
    Teacher add (Teacher teacher);
    Teacher update(Teacher teacher);
    int delete(Integer id);
    Teacher findTeacherById(Integer id);
    List<Teacher> findTeacher();
}
