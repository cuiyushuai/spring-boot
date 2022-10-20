package com.shuai.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author Admin
 * @date 2022/10/20 13:57
 */

@Data
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
  private String name;
  private Integer age;
  private Boolean happy;
  private Date birth;
  private Map<String, Object> maps;
  private List<Object> lists;
  private Dog dog;
}
