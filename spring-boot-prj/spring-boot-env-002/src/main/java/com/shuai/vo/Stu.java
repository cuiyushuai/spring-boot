package com.shuai.vo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Admin
 * @date 2022/10/23 14:34
 */

/**
 * @Component
 * @ConfigurationProperties(prefix = "stu") 与配置文件application.yml 数据进行对应
 */
@Component
@ConfigurationProperties(prefix = "stu")
public class Stu {
  private String name;
  private String age;
  private String sex;

  public Stu(String name, String age, String sex) {
    this.name = name;
    this.age = age;
    this.sex = sex;
  }

  public Stu() {
  }

  @Override
  public String toString() {
    return "Stu{" + "name='" + name + '\'' + ", age='" + age + '\'' + ", sex='" + sex + '\'' + '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }
}
