package com.atguigu.springboot_demo07_springdatajpa.service;

import com.atguigu.springboot_demo07_springdatajpa.dao.BookDao;
import com.atguigu.springboot_demo07_springdatajpa.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BookService {

    @Autowired
    private BookDao bookDao;

    //bookDao接口由于继承了JpaRepository，所以继承了CRUD方法，可以直接使用
    //因为jpa就是一个全自动化的ORM，所以内置了sql语句不用我们写了
    public List<Book> getBookList(){
        return bookDao.findAll();
    }

}
