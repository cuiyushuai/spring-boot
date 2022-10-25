package com.shuai.config;

import org.springframework.context.annotation.Configuration;

/**
 * @author Admin
 * @date 2022/10/23 11:01
 */

@Configuration
public class SpringConfig {

  /**
   * @return Student对象
   * @Bean(name = "***") 相当于 <bean id="***"><bean/>
   */
  //  @Bean(name = "zsStudent")
  //  public Student createStu() {
  //    return new Student("张山", 29, "男");
  //  }
}
