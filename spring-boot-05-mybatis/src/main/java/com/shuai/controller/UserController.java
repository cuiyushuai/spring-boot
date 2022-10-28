package com.shuai.controller;

import com.shuai.pojo.User;
import com.shuai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Admin
 * @date 2022/10/27 17:38
 */
@RestController
public class UserController {

  @Autowired
  private UserService userService;

  @RequestMapping("/user/query")
  public String getUserList() {
    List<User> users = userService.queryUserList();
    return String.valueOf(users);
  }

  @RequestMapping("/user/query/{id}")
  public User getUser(@PathVariable Integer id) {
    User users = userService.getById(id);
    return users;
  }

}
