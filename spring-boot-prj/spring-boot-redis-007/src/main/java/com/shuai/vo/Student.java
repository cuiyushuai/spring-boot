package com.shuai.vo;

import java.io.Serializable;

/**
 * @author Admin
 * @date 2022/10/25 14:49
 */
 
public class Student implements Serializable {
  private static final long serialVersionUID = 7972272104089491224L;

  private Integer id;
  private String name;
  private Integer age;

  public Student() {
  }

  public Student(Integer id, String name, Integer age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + '}';
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

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }
}
