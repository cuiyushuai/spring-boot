package com.shuai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Admin
 * @date 2022/10/26 13:46
 */

@Controller
public class ModelController {

  @RequestMapping("/main")
  public String modelView(Model model) {

    model.addAttribute("data", "第一次使用，，，");

    return "main";
  }

}
