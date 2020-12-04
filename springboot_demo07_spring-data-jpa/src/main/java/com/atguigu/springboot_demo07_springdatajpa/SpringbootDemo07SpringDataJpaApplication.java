package com.atguigu.springboot_demo07_springdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SpringbootDemo07SpringDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemo07SpringDataJpaApplication.class, args);
    }

}
