package com.shuai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Admin
 * @date 2022/10/20 16:35
 */
@Controller
public class Test {

  @RequestMapping("/test")
  public String test(Model model) {

    model.addAttribute("msg", "hello,springboot");

    return "test";
  }
}
