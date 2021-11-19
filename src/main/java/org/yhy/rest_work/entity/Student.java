package org.yhy.rest_work.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName： Student
 * @Description：
 * @Author: yhy
 * @Date： 2021/11/12 13:15
 **/
@Data
@NoArgsConstructor
//@AllArgsConstructor // the annotation is used to update student's information
public class Student {

    private Integer id;
    private String name;
    private String age;
    private String tel;

    // the constructor function is uesd to add a new student
    public Student(String name, String age, String tel){
        this.name = name;
        this.age = age;
        this.tel = tel;
    }

    public Student(Integer id, String name, String age, String tel) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.tel = tel;
    }
}
