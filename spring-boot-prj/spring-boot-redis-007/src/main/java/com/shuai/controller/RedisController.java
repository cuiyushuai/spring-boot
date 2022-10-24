package com.shuai.controller;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Admin
 * @date 2022/10/24 17:16
 */
@RestController
public class RedisController {

  @Resource
  private StringRedisTemplate stringRedisTemplate;

  @PostMapping("/resdia/{k}/{v}")
  public String addRedis(@PathVariable String k, @PathVariable String v) {
    stringRedisTemplate.opsForValue().set(k, v);
    return "使用stringRedisTemplate添加成功";
  }

  @GetMapping("/resdia/{k}")
  public String getRedis(@PathVariable String k) {
    String v = stringRedisTemplate.opsForValue().get(k);
    return "使用stringRedisTemplate添加成功==>" + v;
  }

}
