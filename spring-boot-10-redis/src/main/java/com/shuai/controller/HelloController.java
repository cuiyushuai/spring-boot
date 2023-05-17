package com.shuai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Admin
 * @date 2022/11/11 11:29
 */
@RestController
public class HelloController {
  @GetMapping("/hello")
  public String hello() {
    return "hello ";
  }
}
