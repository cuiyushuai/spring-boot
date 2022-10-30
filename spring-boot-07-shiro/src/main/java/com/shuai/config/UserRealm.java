package com.shuai.config;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * @author Admin
 * @date 2022/10/28 16:07
 */

public class UserRealm extends AuthorizingRealm {

  // 授权
  @Override
  protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
    System.out.println("执行了》===授权 doGetAuthorizationInfo");
    return null;
  }

  // 认证
  @Override
  protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
    System.out.println("执行了》===认证 doGetAuthenticationInfo");
    // 后期从数据库拿
    String username = "root";
    String password = "123456";
    UsernamePasswordToken usertoken = (UsernamePasswordToken)token;
    if (!usertoken.getUsername().equals(username)) {
      return null; // 抛出异常
    }
    // 密码认证，shiro
    return new SimpleAuthenticationInfo("", password, "");
  }
}
