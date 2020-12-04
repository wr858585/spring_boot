package com.atguigu.springboot_demo07_springdatajpa.controller;

import com.atguigu.springboot_demo07_springdatajpa.pojo.Book;
import com.atguigu.springboot_demo07_springdatajpa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private BookService bookService;

    @RequestMapping("/list")
    public List<Book> getBookList(){
        System.out.println(dataSource.getClass());
        return bookService.getBookList();
    }

}
