package com.atguigu.dao;

import com.atguigu.bean.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookMapper {

    @Select("select bookId id, bookName bookName from book")
    public List<Book> getBookList();

}
