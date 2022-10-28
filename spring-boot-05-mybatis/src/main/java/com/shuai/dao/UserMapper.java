package com.shuai.dao;

import com.shuai.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Admin
 * @date 2022/10/27 17:27
 */
@Mapper
public interface UserMapper {

  List<User> queryUserList();

  User getById(Integer id);
}
