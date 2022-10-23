package com.shuai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Admin
 * @date 2022/10/23 15:45
 */
@Controller
public class BootController {

  @RequestMapping("/user/login")
  @ResponseBody
  public String login() {
    return "login接口";
  }

  @RequestMapping("/user/info")
  @ResponseBody
  public String info() {
    return "info接口";
  }

}
