package com.atguigu.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AppJob01 {

    @Scheduled(fixedDelay = 1000)
    public void sayHello(){
        System.out.println("每隔一秒显示一次事件");
    }

}
