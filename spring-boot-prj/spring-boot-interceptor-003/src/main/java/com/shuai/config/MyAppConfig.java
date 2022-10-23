package com.shuai.config;

import com.shuai.web.Loginterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Admin
 * @date 2022/10/23 15:41
 */

@Configuration
public class MyAppConfig implements WebMvcConfigurer {
  @Override
  public void addInterceptors(InterceptorRegistry registry) {

    HandlerInterceptor interceptor = new Loginterceptor();

    String path[] = {"/user/**"};
    String excludePath[] = {"/user/login"};

    registry.addInterceptor(interceptor).addPathPatterns(path).excludePathPatterns(excludePath);
  }
}
