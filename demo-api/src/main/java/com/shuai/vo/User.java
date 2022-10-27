package com.shuai.vo;

import java.io.Serializable;

/**
 * @author Admin
 * @date 2022/10/26 15:04
 */
public class User implements Serializable {
  private static final long serialVersionUID = -819316895042653344L;
  private Integer id;
  private String name;
  private String password;
  private String nname;

  @Override
  public String toString() {
    return "User{" + "id=" + id + ", name='" + name + '\'' + ", password='" + password + '\'' + ", nname='" + nname + '\'' + '}';
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getNname() {
    return nname;
  }

  public void setNname(String nname) {
    this.nname = nname;
  }

  public User(Integer id, String name, String password, String nname) {
    this.id = id;
    this.name = name;
    this.password = password;
    this.nname = nname;
  }

  public User() {

  }
}
