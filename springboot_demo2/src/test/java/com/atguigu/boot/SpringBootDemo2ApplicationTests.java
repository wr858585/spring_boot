package com.atguigu.boot;

import com.atguigu.boot.controller.UserController;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @SpringBootTest依赖了JUnit的@Test注解 对于2.3.4版本的SpringBootTest依赖的：
 * 是5.x版本的Junit，不要求类必须是public修饰，也不要求方法必须是public修饰，import的是org.junit.jupiter.api.Test
 * 如果是4.x版本的Junit，class和method前都必须家上public否则报错，且要在类上家上@RunWith(SpringRunner.class)才好使
 */

@SpringBootTest
class SpringBootDemo2ApplicationTests {

    //每个test方法都需要一个logger，所以直接提出来
    private Logger logger = LoggerFactory.getLogger(SpringBootDemo2ApplicationTests.class);

    @Autowired
    private UserController userController;

    @Test
    void contextLoads() {
        logger.debug("debug........");
        logger.info("info........");
        logger.error("error........");
        System.out.println(userController);
    }

}
