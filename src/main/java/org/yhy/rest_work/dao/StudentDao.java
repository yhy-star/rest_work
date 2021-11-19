package org.yhy.rest_work.dao;

import org.apache.ibatis.annotations.*;
import org.yhy.rest_work.entity.Student;

/**
 * @ClassName： StudentDao
 * @Description：
 * @Author: yhy
 * @Date： 2021/11/12 14:32
 **/
@Mapper
public interface StudentDao {

    @Select("select * from student where id = #{id}")
    public Student getStudentById(int id);

    @Insert("insert into student (name, age, tel) values(#{name}, #{age}, #{tel})")
    public int postStudent(String name, String age, String tel);

    @Delete("delete from student where id = #{id}")
    public int deleteStudent(int id);

    @Update("update student set name = #{name}, age = #{age}, tel = #{tel} where id = #{id}")
    public int updateStudent(String name, String age, String tel, int id);
}
