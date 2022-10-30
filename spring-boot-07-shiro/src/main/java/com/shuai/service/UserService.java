package com.shuai.service;

import com.shuai.pojo.User;

import java.util.List;

/**
 * @author Admin
 * @date 2022/10/28 17:51
 */
public interface UserService {

  List<User> queryUserList();

  User getById(Integer id);

  User getByName(String username);
}
