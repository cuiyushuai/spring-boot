package com.shuai.service;

import com.shuai.vo.User;

/**
 * @author Admin
 * @date 2022/10/26 15:06
 */

// Dubbo接口
public interface UserDao {
  int addUser(User user);

  User queryUser(Integer id);
}
