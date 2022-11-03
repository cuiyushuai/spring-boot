package com.shuai.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author Admin
 * @date 2022/11/1 9:50
 */
@Service
public class HelloService {

  @Async
  public void hello() {
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("执行到这里了");
  }
}
