package com.shuai.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Admin
 * @date 2022/11/4 10:12
 */
@Service
public class ScheduledService {

  /**
   * 参考  https://cron.qqe2.com/  --cron
   */
  @Scheduled(cron = "0/3 * * * * ? ")
  public void hello1() {
    System.out.println("hello方法被执行了");
  }
}
