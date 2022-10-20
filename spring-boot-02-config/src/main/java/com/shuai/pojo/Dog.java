package com.shuai.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author Admin
 * @date 2022/10/20 13:58
 */
@Data
@Component
public class Dog {
  private String name;
  private Integer age;

}
