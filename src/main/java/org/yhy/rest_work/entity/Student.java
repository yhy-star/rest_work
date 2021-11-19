package org.yhy.rest_work.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

/**
 * @ClassName： Student
 * @Description：
 * @Author: yhy
 * @Date： 2021/11/12 13:15
 **/
//@Data
@Getter
@NoArgsConstructor
//@AllArgsConstructor // the annotation is used to update student's information
public class Student extends RepresentationModel<Student> {

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

    @JsonCreator
    public Student(@JsonProperty("id") Integer id, @JsonProperty("name") String name, @JsonProperty("age") String age, @JsonProperty("tel") String tel) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.tel = tel;
    }

}
