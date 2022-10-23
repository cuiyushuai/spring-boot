package com.shuai.web;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author Admin
 * @date 2022/10/23 16:06
 */
public class MyFilter implements Filter {

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    System.out.println("执行了doFilter，MyFilter");
    chain.doFilter(request, response);
  }
}
