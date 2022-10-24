package com.shuai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Admin
 * @date 2022/10/24 14:09
 */
@SpringBootApplication
@MapperScan("com.shuai.dao")
@EnableTransactionManagement // 开启注解事务管理，等价于xml配置方式的 <tx:annotation-driven />
public class MySpringBoot {
  public static void main(String[] args) {
    SpringApplication.run(MySpringBoot.class, args);
  }
}
