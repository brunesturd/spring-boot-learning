package com.inky.boot.mybatis.mapper;

import com.inky.boot.mybatis.domain.Teacher;

import java.util.List;

/**
 * @author asus
 */
public interface TeacherMapper {
    int deleteByPrimaryKey(Integer teacherId);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer teacherId);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
    List<Teacher> selectAll();
}