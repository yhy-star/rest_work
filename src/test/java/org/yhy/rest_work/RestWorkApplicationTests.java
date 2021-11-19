package org.yhy.rest_work;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.yhy.rest_work.entity.Student;
import org.yhy.rest_work.service.StudentService;

@SpringBootTest
class RestWorkApplicationTests {
    @Autowired
    StudentService service;

    @Test
    void contextLoads() {
    }

//    @Test
//    void postStudent(){
//        System.out.println(service.postStudent("Soa1", "33", "13322220000"));
//    }

    @Test
    void deleteStudent(){
        System.out.println(service.deleteStudent(4));
    }

    @Test
    void  updateStudent(){
        Student student = new Student(6, "SOA", "大三", "8209190522");
        System.out.println(service.updateStudent(student));
    }

//    @Test
//    void putStudent(){
//        Student student = mnew
//    }


}
