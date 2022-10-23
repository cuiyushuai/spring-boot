package com.shuai;

import com.shuai.config.SpringConfig;
import com.shuai.vo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Admin
 * @date 2022/10/23 10:53
 */
public class MyTest {
  /**
   * xml 方式
   */
  @Test
  public void test01() {
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    Student stu = (Student)context.getBean("stu");
    System.out.println("容器内：" + stu);
  }

  /**
   * 使用JavaConfig方式
   */
  @Test
  public void test02() {
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    Student stu = (Student)context.getBean("zsStudent");
    System.out.println("使用JavaConfig方式" + stu);
  }
}
