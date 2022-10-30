package com.shuai.controller;

import com.shuai.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Admin
 * @date 2022/10/28 15:50
 */
@Controller
public class MyController {

  @Autowired
  private UserService userService;

  @RequestMapping({"/", "/index"})
  public String index() {
    return "index";
  }

  @RequestMapping("/user/add")
  public String add() {
    return "user/add";
  }

  @RequestMapping("/user/update")
  public String update() {
    return "user/update";
  }

  @RequestMapping("/toLogin")
  public String toLogin() {
    return "login";
  }

  @RequestMapping("/login")
  public String login(String username, String password, Model model) {
    Subject subject = SecurityUtils.getSubject();

    UsernamePasswordToken token = new UsernamePasswordToken(username, password);

    try {
      subject.login(token);
      return "index";
    } catch (UnknownAccountException e) {
      model.addAttribute("msg", "账号错误");
      return "login";
    } catch (IncorrectCredentialsException e) {
      model.addAttribute("msg", "密码错误");
      return "login";
    }
  }

}
