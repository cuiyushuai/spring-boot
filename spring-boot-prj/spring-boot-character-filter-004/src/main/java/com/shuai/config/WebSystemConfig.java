package com.shuai.config;

import com.shuai.web.Myservlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * @author Admin
 * @date 2022/10/23 17:01
 */
@Configuration
public class WebSystemConfig {
  @Bean
  public ServletRegistrationBean servletRegistrationBean() {
    Myservlet myservlet = new Myservlet();
    ServletRegistrationBean reg = new ServletRegistrationBean(myservlet, "/myservlet");
    return reg;
  }

  // 注册filter
  @Bean
  public FilterRegistrationBean filterRegistrationBean() {
    FilterRegistrationBean reg = new FilterRegistrationBean();

    // 使用框架中的过滤器
    CharacterEncodingFilter filter = new CharacterEncodingFilter();
    // 设置编码
    filter.setEncoding("UTF-8");
    filter.setForceEncoding(true);
    reg.setFilter(filter);

    reg.addUrlPatterns("/*");
    return reg;
  }

}
