package com.shuai;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class AppTests {

  @Autowired
  @Qualifier("redisTemplates")
  private RedisTemplate redisTemplate;

  @Test
  void contextLoads() {

    redisTemplate.opsForValue().set("mykey", "帅");
    System.out.println(redisTemplate.opsForValue().get("mykey"));
  }

}
