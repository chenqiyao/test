package com.ssm.service;

import com.ssm.model.Student;

import java.util.List;

/**
 * Created by 陈齐尧 on 2019/2/23.
 */
public interface StudentService {
    //查全部信息
    List<Student> selectAll();
    //查单条信息
    Student selectById(Integer sid);

    int delectStudent(Integer sid);
    int updateStudent(Student student);
    int inseretStudent(Student student);
}
