package com.shuai.config;

import com.shuai.web.Loginterceptor;
import com.shuai.web.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
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

  /**
   * 拦截器
   * @param registry
   */
  @Override
  public void addInterceptors(InterceptorRegistry registry) {

    HandlerInterceptor interceptor = new Loginterceptor();

    String path[] = {"/user/**"};
    String excludePath[] = {"/user/login"};

    registry.addInterceptor(interceptor).addPathPatterns(path).excludePathPatterns(excludePath);
  }

  /**
   * 过滤器
   */
  @Bean
  public FilterRegistrationBean filterRegistrationBean() {
    FilterRegistrationBean bean = new FilterRegistrationBean();

    bean.setFilter(new MyFilter());
    bean.addUrlPatterns("/user/*");
    return bean;
  }
}
