package com.shuai.config;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Admin
 * @date 2022/10/28 15:56
 */
@Configuration
public class ShiroConfig {

  @Bean
  public ShiroFilterFactoryBean getShiroFilterFactoryBean(
      @Qualifier("sessionManager") DefaultWebSecurityManager sessionManager) {
    ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
    bean.setSecurityManager(sessionManager);

    /**
     * anon: 无需认证就可以访间
     * authc: 必须认证了才能让问
     * user: 必须拥有记住我功能才能用
     * perms:拥有对某 个资源的权限才能访问;
     * role: 拥有某个角色权限才能访问
     */
    Map<String, String> filterMap = new HashMap<>();
    // 拦截
    //    filterMap.put("/user/add", "authc");
    //    filterMap.put("/user/update", "authc");
    filterMap.put("/user/*", "authc");
    // 设置登录请求
    bean.setLoginUrl("/toLogin");
    bean.setFilterChainDefinitionMap(filterMap);
    return bean;
  }

  // DefaultWebSessionManager ：2
  @Bean(name = "sessionManager")
  public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm) {
    DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
    securityManager.setRealm(userRealm);
    return securityManager;
  }

  // 创建realm对象，需自定义  ：1
  @Bean
  public UserRealm userRealm() {
    return new UserRealm();
  }
}
