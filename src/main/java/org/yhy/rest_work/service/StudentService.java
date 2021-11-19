package org.yhy.rest_work.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yhy.rest_work.dao.StudentDao;
import org.yhy.rest_work.entity.Student;

/**
 * @ClassName： StudentService
 * @Description：
 * @Author: yhy
 * @Date： 2021/11/12 14:34
 **/
public interface StudentService {

    public Student getStudent(int id);

    public int postStudent(Student student);

    public int deleteStudent(int id);

    public int updateStudent(Student student);
}
