package com.shuai.service.impl;

import com.shuai.dao.UserMapper;
import com.shuai.pojo.User;
import com.shuai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Admin
 * @date 2022/10/27 17:37
 */
@Service
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
