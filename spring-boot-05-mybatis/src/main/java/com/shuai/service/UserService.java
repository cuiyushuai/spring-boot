package com.shuai.service;

import com.shuai.pojo.User;

import java.util.List;

/**
 * @author Admin
 * @date 2022/10/27 17:36
 */
public interface UserService {

  List<User> queryUserList();

  User getById(Integer id);
}
