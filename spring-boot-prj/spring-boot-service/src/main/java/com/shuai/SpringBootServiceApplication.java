package com.shuai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootServiceApplication.class, args);
    //    ApplicationContext run = SpringApplication.run(SpringBootServiceApplication.class, args);
    //    UserService userService = (UserService)run.getBean("userService");
    //    userService.Users("李四，");
  }

}
