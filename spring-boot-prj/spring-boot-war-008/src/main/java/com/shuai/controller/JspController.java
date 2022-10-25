package com.shuai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Admin
 * @date 2022/10/25 16:44
 */

@Controller
public class JspController {

  @RequestMapping("/index")
  public String index(Model model) {
    model.addAttribute("data", "测试打包是否war");
    return "index";
  }

  @RequestMapping("/index1")
  @ResponseBody
  public String index1() {
    return "index";
  }
}
