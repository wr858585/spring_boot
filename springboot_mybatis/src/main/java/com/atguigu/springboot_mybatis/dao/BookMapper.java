package com.atguigu.springboot_mybatis.dao;

import com.atguigu.springboot_mybatis.pojo.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookMapper {

    //用@Select注解后，就不用再写BookMapper.xml的sql语句了！
    @Select("select bookId, bookName, price from book")
    public List<Book> getBookList();

    @Options(useGeneratedKeys = true, keyProperty = "bookId")
    @Insert("insert into book(bookName,price) values(#{bookName},#{price}")
    void addBook(Book book);
}
