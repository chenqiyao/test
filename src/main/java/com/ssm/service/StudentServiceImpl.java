package com.ssm.service;

import com.ssm.dao.StudentDao;
import com.ssm.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 陈齐尧 on 2019/2/23.
 */
@Service("StudentService")
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> selectAll() {
        return studentDao.selectAll();
    }

    @Override
    public Student selectById(Integer sid) {
        return studentDao.selectById(sid);
    }

    @Override
    public int delectStudent(Integer sid) {
        return studentDao.delectStudent(sid);
    }

    @Override
    public int updateStudent(Student student) {
        return studentDao.updateStudent(student);
    }

    @Override
    public int inseretStudent(Student student) {
        return studentDao.inseretStudent(student);
    }
}
