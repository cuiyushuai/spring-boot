package com.shuai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author Admin
 * @date 2022/10/27 15:58
 */

@RestController
public class JDBCController {

  @Autowired
  JdbcTemplate jdbcTemplate;

  @RequestMapping("/user")
  public List<Map<String, Object>> userList() {
    String sql = "select * from t_user";
    List<Map<String, Object>> userList = jdbcTemplate.queryForList(sql);
    return userList;
  }

  @RequestMapping("/adduser")
  public String addUser() {
    String sql = "insert into t_user(id,name,password,nname) values(4,'王叔叔','8798','dkljg')";
    int res = jdbcTemplate.update(sql);
    return "ok" + res;
  }

  @RequestMapping("/updateuser/{id}")
  public String updateUser(@PathVariable Integer id) {
    String sql = "update t_user set name=?,password=?,nname=?  where id = " + id;

    Object[] objects = new Object[3];
    objects[0] = "小明";
    objects[1] = "444325";
    objects[2] = "gfggfh";
    jdbcTemplate.update(sql, objects);
    return "updateuser-ok";
  }

  @RequestMapping("/deluser/{id}")
  public String delUser(@PathVariable Integer id) {
    String sql = "delete from t_user where id= ?";
    jdbcTemplate.update(sql, id);
    return "del-ok";
  }

}
