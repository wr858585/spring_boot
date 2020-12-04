package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringbootDemo06RedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemo06RedisApplication.class, args);
    }

}
