package org.yhy.rest_work.entity;

/**
 * @ClassName： Links
 * @Description：
 * @Author: yhy
 * @Date： 2021/11/13 13:10
 **/
public class Links {

    private String getStudentUrl = "inquiry_Student_url(GET)  :  localhost:8080/soa/students/{id}";
    private String addStudentUrl = "add_Student_url(POST)  :  localhost:8080/soa/students";
    private String deleteStudentUrl = "delete_Student_url(DELETE) : localhost:8080/soa/students?id={id}";
    private String updateStudentUrl = "update_Student_url(PUT) : localhost:8080/soa/students";

    public String getStudent;
    public String addStudent;
    public String deleteStudent;
    public String updateStudent;

    public Links(){
        this.getStudent = getStudentUrl;
        this.addStudent = addStudentUrl;
        this.deleteStudent = deleteStudentUrl;
        this.updateStudent = updateStudentUrl;
    }
}
