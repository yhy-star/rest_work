package org.yhy.rest_work.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.*;
import org.yhy.rest_work.entity.Student;
import org.yhy.rest_work.service.Impl.StudentServiceImpl;
import org.yhy.rest_work.service.StudentService;
import org.yhy.rest_work.util.CommonResponse;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

/**
 * @ClassName： StudentController
 * @Description：
 * @Author: yhy
 * @Date： 2021/11/12 14:38
 **/
@RestController
@RequestMapping("/soa")
public class StudentController {

    @Autowired
    private StudentService service = new StudentServiceImpl();


    @GetMapping("/students/{id}")
    public CommonResponse<Student> getStudent(@PathVariable("id") int id){
        Student student = service.getStudent(id);
//        student.add(Link.of());
//        student.add(linkTo(methodOn(StudentController.class).deleteStudent(id)).withRel("delete"));
//        student.add(linkTo(methodOn(StudentController.class).postStudent(student)).withRel("12"));
//        student.add(linkTo(methodOn(StudentController.class).postStudent()).withRel())
        return CommonResponse.createForSuccessMessage("查询成功", student);
    }

    @PostMapping("/students")
    public CommonResponse<Student> postStudent(@RequestBody Student student){
        // the function will return 1 if add a student successfully
        int result = service.postStudent(student);
        if (result == 1) {
            return CommonResponse.createForSuccessMessage("新增成功", student);
        } else {
            return CommonResponse.createForErrorMessage("添加失败");
        }
//        return service.postStudent(student);
    }

    @DeleteMapping("/students")
    public CommonResponse deleteStudent(@RequestParam("id") int id){
        // the function will return 1 if add a student successfully
        int result = service.deleteStudent(id);
        if (result == 1){
            return CommonResponse.createForSuccessDelete("删除成功");
        } else {
            return CommonResponse.createForErrorMessage("删除失败");
        }
//        return service.deleteStudent(id);
    }

    @PutMapping("/students")
    public CommonResponse<Student> updateStudent(@RequestBody Student student){

        int result = service.updateStudent(student);

        if(result == 1){
            //查询更新之后的学生信息
            Student student1 = service.getStudent(student.getId());
            return CommonResponse.createForSuccessMessage("更新成功", student1);
        } else {
            return CommonResponse.createForErrorMessage("创建失败");
        }
//        return service.updateStudent(student);
    }
}
