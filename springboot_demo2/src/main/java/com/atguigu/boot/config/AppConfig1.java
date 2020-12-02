package com.atguigu.boot.config;

import com.atguigu.boot.bean.Book;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@ConditionalOnClass(Book.class)//表示只有当满足有某个类（如：Book）的时候，才生成对应的IOC容器
//@ConditionalOnBean()//表示只有当满足有某个bean的时候，才生成对应的IOC容器
@Configuration
@Import(AppConfig.class)
//@Import注解：相当于以前的<import>标签，引入另一个配置文件
public class AppConfig1 {


}
