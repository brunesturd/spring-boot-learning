package com.example.boot.basic.service.impl;

import com.example.boot.basic.dao.TeacherDAO;
import com.example.boot.basic.entity.Teacher;
import com.example.boot.basic.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

/**
 * @Author asus
 * @Description
 * @Date 2021/3/18
 **/
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherDAO teacherDAO;
    @Override
    public Teacher add(Teacher teacher) {
        Teacher save = teacherDAO.save(teacher);
        return save;
    }

    @Override
    public Teacher update(Teacher teacher) {
        return teacherDAO.saveAndFlush(teacher);
    }

    @Override
    public int delete(Integer id) {
        teacherDAO.deleteById(id);
        return 0;
    }

    @Override
    public Teacher findTeacherById(Integer id) {
        Optional<Teacher> teacher = teacherDAO.findById(id);
        if (teacher != null) {
            return teacher.get();
        }
        return null;
    }

    @Override
    public List<Teacher> findTeacher() {
        return teacherDAO.findAll();
    }

}
