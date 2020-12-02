package com.atguigu.springboot_mybatis.controller;

import com.atguigu.springboot_mybatis.dao.BookMapper;
import com.atguigu.springboot_mybatis.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookMapper bookMapper;

    @RequestMapping("/list")
    public List<Book> getBookList(){
        return bookMapper.getBookList();
    }

    @RequestMapping("/addBook")
    public void addBook(Book book){
        bookMapper.addBook(book);
    };

}
