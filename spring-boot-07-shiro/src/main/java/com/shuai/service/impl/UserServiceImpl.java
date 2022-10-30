package com.shuai.service.impl;

import com.shuai.dao.UserMapper;
import com.shuai.pojo.User;
import com.shuai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Admin
 * @date 2022/10/28 17:52
 */
public class UserServiceImpl implements UserService {

  @Autowired
  private UserMapper userMapper;

  @Override
  public List<User> queryUserList() {
    return userMapper.queryUserList();
  }

  @Override
  public User getById(Integer id) {
    return userMapper.getById(id);
  }
}
