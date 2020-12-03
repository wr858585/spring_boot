package com.atguigu.springboot_mybatis.controller;

import com.atguigu.springboot_mybatis.dao.BookMapper;
import com.atguigu.springboot_mybatis.pojo.Book;
import com.atguigu.springboot_mybatis.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private DataSource dataSource;

    @Autowired
    private BookService bookService;

    @RequestMapping("/insert")
    public Map<String,Object> insert(){
        bookService.insert();
        HashMap<String, Object> map = new HashMap<>();
        map.put("key1","value1");
        return map;
    }

    @RequestMapping("/list")
    public List<Book> getBookList(){
        System.out.println(dataSource.getClass());
        return bookMapper.getBookList();
    }

    @RequestMapping("/addBook")
    public void addBook(Book book){
        bookMapper.addBook(book);
    };

}
