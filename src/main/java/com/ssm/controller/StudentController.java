package com.ssm.controller;

import com.ssm.model.Student;
import com.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by 陈齐尧 on 2019/2/23.
 */

// 告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("")
public class StudentController {
    @Autowired
    private StudentService studentService;

    public ModelAndView listStudent(){
        ModelAndView modelAndView=new ModelAndView();
        List<Student> studentList=studentService.selectAll();

        // 放入转发参数
        modelAndView.addObject("studentList",studentList);
        // 放入jsp路径
        modelAndView.setViewName("studentList");
        return modelAndView;
    }
}
