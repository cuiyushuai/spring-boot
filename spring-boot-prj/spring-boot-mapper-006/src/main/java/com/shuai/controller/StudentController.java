package com.shuai.controller;

import com.shuai.model.Student;
import com.shuai.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author Admin
 * @date 2022/10/24 14:24
 */

@Controller
public class StudentController {

  @Resource
  private StudentService studentService;

  @RequestMapping("/student/query")
  @ResponseBody
  public String queryStudent(Integer id) {
    Student student = studentService.queryStu(id);
    return student.toString();
  }
}
