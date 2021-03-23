package com.example.boot.basic.dao;

import com.example.boot.basic.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author asus
 * @Description
 * @Date 2021/3/18
 **/
public interface TeacherDAO extends JpaRepository<Teacher, Integer> {
}
