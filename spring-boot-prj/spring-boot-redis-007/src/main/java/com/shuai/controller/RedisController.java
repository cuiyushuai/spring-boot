package com.shuai.controller;

import com.shuai.vo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
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

  @Autowired
  private RedisTemplate redisTemplate;
  @Resource
  private StringRedisTemplate stringRedisTemplate;

  @PostMapping("/redis/{k}/{v}")
  public String addRedis(@PathVariable String k, @PathVariable String v) {
    // key值 设置StringRedisSerializer
    redisTemplate.setKeySerializer(new StringRedisSerializer());
    redisTemplate.opsForValue().set(k, v);
    return "使用stringRedisTemplate添加成功";
  }

  @GetMapping("/redis/{k}")
  public String getRedis(@PathVariable String k) {

    // value值 设置StringRedisSerializer
    redisTemplate.setValueSerializer(new StringRedisSerializer());
    return "使用stringRedisTemplate添加成功==>" + redisTemplate.opsForValue().get(k);
  }

  /**
   * 使用JSON序列化  将对象放入Redis中
   */
  @PostMapping("/redis/setJson")
  public String setJson() {

    Student student = new Student();
    student.setId(1001);
    student.setName("顽固");
    student.setAge(24);

    redisTemplate.setKeySerializer(new StringRedisSerializer());

    // 设置value的序列化器
    //使用Jackson 2，将对象序列化为JSON
    redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<Object>(Object.class));

    redisTemplate.opsForValue().set("mystudent", student);

    return "json 添加成功";
  }

  @GetMapping("/redis/getJson")
  public String getJson() {

    redisTemplate.setKeySerializer(new StringRedisSerializer());

    // 设置value的序列化器
    //使用Jackson 2，将对象序列化为JSON
    redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<Object>(Object.class));

    Object stu = redisTemplate.opsForValue().get("mystudent");

    return "json " + stu;
  }

}
