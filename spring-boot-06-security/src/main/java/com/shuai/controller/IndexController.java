package com.shuai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Admin
 * @date 2022/10/28 11:02
 */
@Controller
public class IndexController {

  @RequestMapping({"/", "/index"})
  public String index() {
    return "index";
  }
}
