package com.shuai.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Admin
 * @date 2022/10/31 14:53
 */

@Api(value = "用户接口", tags = "用户接口")
@RestController
public class HelloController {

  @ApiOperation(value = "用户注册")
  @ApiImplicitParams(
      {@ApiImplicitParam(name = "name", value = "姓名", required = true, paramType = "query", dataType = "String",
          defaultValue = ""), @ApiImplicitParam(name = "password", value = "密码", required = true, paramType = "query",
          dataType = "String", defaultValue = "")})
  @PostMapping("/hello")
  public String hello(String name, String password) {
    return "hello:" + name + "," + password;
  }
}
