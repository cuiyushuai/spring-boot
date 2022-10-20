package com.shuai;

import com.shuai.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot02ConfigApplicationTests {

  @Autowired
  Person person;

  @Test
  void contextLoads() {

    System.out.println(person);
  }

}
