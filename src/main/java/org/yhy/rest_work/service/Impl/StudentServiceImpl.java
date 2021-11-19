package org.yhy.rest_work.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yhy.rest_work.dao.StudentDao;
import org.yhy.rest_work.entity.Student;
import org.yhy.rest_work.service.StudentService;

/**
 * @ClassName： StudentServiceImpl
 * @Description：
 * @Author: yhy
 * @Date： 2021/11/12 14:34
 **/
@Service("StudentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;

    @Override
    public Student getStudent(int id) {
        return studentDao.getStudentById(id);
    }

    @Override
    public int postStudent(Student student) {
        String name = student.getName();
        String age = student.getAge();
        String tel = student.getTel();
        return studentDao.postStudent(name, age, tel);
    }

    @Override
    public int deleteStudent(int id) {
        return studentDao.deleteStudent(id);
    }

    @Override
    public int updateStudent(Student student) {
        String name = student.getName();
        String age = student.getAge();
        String tel = student.getTel();
        int id = student.getId();
        return studentDao.updateStudent(name, age, tel, id);
    }
}
