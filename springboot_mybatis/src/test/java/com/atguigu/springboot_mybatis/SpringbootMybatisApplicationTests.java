package com.atguigu.springboot_mybatis;

import com.atguigu.springboot_mybatis.controller.BookController;
import com.atguigu.springboot_mybatis.pojo.Book;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisApplicationTests {

    private Logger logger = LoggerFactory.getLogger(SpringbootMybatisApplicationTests.class);

    @Autowired
    private BookController bookController;

    @Test
    void contextLoads() {
        logger.debug("debug开始了");
        logger.info("info开始了");
        logger.error("error开始了");
        bookController.addBook(new Book(null,"堂吉诃德",99.9));
        List<Book> bookList = bookController.getBookList();
        System.out.println(bookList);
    }

}
