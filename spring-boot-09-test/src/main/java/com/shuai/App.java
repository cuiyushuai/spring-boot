package com.shuai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author 小帅
 * @EnableAsync // 开启异步任务的注解
 * @EnableScheduling //开启定时任务的注解
 */
@EnableAsync
@EnableScheduling
@SpringBootApplication
public class App {

  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }

}
