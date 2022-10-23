package com.shuai.service.Impl;

import com.shuai.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author Admin
 * @date 2022/10/23 14:54
 */

@Service("userService")
public class UserServiceImpl implements UserService {
  @Override
  public void Users(String name) {
    System.out.println(name + "执行了！");
  }
}
