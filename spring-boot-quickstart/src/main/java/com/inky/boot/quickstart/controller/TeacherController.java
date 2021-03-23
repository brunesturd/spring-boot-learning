package com.example.boot.basic.controller;

import com.example.boot.basic.entity.Teacher;
import com.example.boot.basic.service.TeacherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author asus
 * @Description
 * @Date 2021/3/18
 **/

@RestController
public class TeacherController {

    private TeacherService teacherService;

    @GetMapping(value = "add")
    public String addTeacher(Teacher teacher){
        Teacher teacher1 = teacherService.add(teacher);
        return teacher1.toString();
    }

    @GetMapping (value = "list")
    public Object list(@RequestParam("id") Integer id){
        if(id == null){
            return teacherService.findTeacher();
        }else {
            return teacherService.findTeacherById(id).toString();
        }
    }

    @GetMapping("update")
    public String updateTeacher(Teacher teacher){
        Teacher teacher1 = teacherService.update(teacher);
        return teacher1.toString();
    }
}
