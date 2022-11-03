package com.shuai.controller;

import com.shuai.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Admin
 * @date 2022/11/1 9:53
 */

@RestController
public class HelloController {

  @Resource
  private HelloService helloService;

  @RequestMapping("/hello")
  public String hello() {
    helloService.hello();
    return "ok";
  }
}
