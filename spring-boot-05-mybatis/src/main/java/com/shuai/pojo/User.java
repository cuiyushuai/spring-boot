package com.shuai.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Admin
 * @date 2022/10/27 17:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
  private Integer id;
  private String name;
  private String pwd;
}
