package com.shuai.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author Admin
 * @date 2022/10/31 14:55
 */

@EnableOpenApi
@Configuration
public class SwaggerConfiguration {
  //  访问地址 /swagger-ui/index.html
  @Bean
  public Docket createRestApi(Environment environment) {
    Profiles dev = Profiles.of("dev");
    boolean flag = environment.acceptsProfiles(dev);
    System.out.println(flag);

    return new Docket(DocumentationType.OAS_30).apiInfo(apiInfo())
        // 是否开启
        .enable(flag).select()
        // 扫描的路径包
        .apis(RequestHandlerSelectors.basePackage("com.shuai.controller"))
        // 指定路径处理PathSelectors.any()代表所有的路径
        .paths(PathSelectors.any()).build();
  }

  private ApiInfo apiInfo() {
    return new ApiInfoBuilder().title("Spring Boot中演示swaggerUI").description("1749697844@qq.com")
        .contact(new Contact("帅气", "", "111")).version("v1.0").build();
  }
}