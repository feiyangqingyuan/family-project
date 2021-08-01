package com.family.bookkeeping.common.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author pengyy
 * @date 2021/08/01
 */
@Configuration
@EnableKnife4j
public class Knife4jConfiguration {

    @Bean(value = "api3.0")
    public Docket api() {
        return new Docket(DocumentationType.OAS_30)
            .apiInfo(new ApiInfoBuilder()
                .title("记账系统 RESTful APIs")
                .description("# 家庭项目-记账系统 RESTful APIs")
                .termsOfServiceUrl("http://192.168.1.196:8081")
                .contact(new Contact("feiyang", "no url", "feiyangqingyuan@163.com"))
                .version("1.0")
                .build())
            // 分组名称
            .groupName("1.0.0版本")
            .select()
            // 这里指定Controller扫描包路径
            .apis(RequestHandlerSelectors.basePackage("com.family.bookkeeping.controller"))
            .paths(PathSelectors.any())
            .build();
    }
}
