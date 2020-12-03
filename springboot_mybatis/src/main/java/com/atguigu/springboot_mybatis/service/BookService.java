package com.atguigu.springboot_mybatis.service;

import com.atguigu.springboot_mybatis.dao.BookMapper;
import com.atguigu.springboot_mybatis.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;

    @Transactional
    public void insert(){
        Book book = new Book(null,"平凡的世界",99.9);
        bookMapper.addBook(book);
        int i = 10/0;
    }

}