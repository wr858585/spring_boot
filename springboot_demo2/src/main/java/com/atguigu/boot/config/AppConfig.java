package com.atguigu.boot.config;

import com.atguigu.boot.bean.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//加了这个注解：就是一个配置类了，相当于一个applicationContext.xml文件，就是一个容器，里面bean对象用@Bean注解
public class AppConfig {

    //applicationContext.xml <bean class="id">
    @Bean
    public Book getBookObject() {
        return new Book("堂吉诃德", 1, 99.0);
    }

    @Bean(value = "abc")
    public Book getBookObject1() {
        return new Book("堂吉诃德", 1, 100.0);
    }

}
