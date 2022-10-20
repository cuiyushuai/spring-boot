package com.shuai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Admin
 * @date 2022/10/20 10:57
 */

@Controller
public class HelloController {

  @RequestMapping("/hello")
  @ResponseBody
  public String hello(){
    return "hello ";
  }

}
