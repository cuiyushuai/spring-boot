package com.shuai.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Admin
 * @date 2022/10/23 14:02
 */

@Controller
public class BootCpntroller {

  @RequestMapping("/hello")
  @ResponseBody
  public String hello() {
    return "Hello,Springboot;";
  }

  /**
   * 获取配置文件中的信息
   * 通过 @Value("${***}") 来获取
   */
  @Value("${server.port}")
  private int ports;

  @Value("${stu.name}")
  private String name;
  @Value("${stu.age}")
  private String age;
  @Value("${stu.sex}")
  private String sex;

  @RequestMapping("/data")
  @ResponseBody
  public String queryData() {
    return "Hello,Springboot;" + ports + name + "," + age + "," + sex;
  }
}
