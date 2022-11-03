package com.shuai;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootTest
class AppTests {

  @Autowired
  JavaMailSender javaMailSender;

  @Test
  void contextLoads() {
    SimpleMailMessage message = new SimpleMailMessage();
    message.setSubject("小");
    message.setText("学习");

    message.setTo("1749697844@qq.com");
    message.setFrom("1749697844@qq.com");
    javaMailSender.send(message);
  }

}
