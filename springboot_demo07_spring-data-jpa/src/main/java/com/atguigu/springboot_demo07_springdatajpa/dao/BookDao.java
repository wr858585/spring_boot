package com.atguigu.springboot_demo07_springdatajpa.dao;


import com.atguigu.springboot_demo07_springdatajpa.pojo.Book;
import org.springframework.data.jpa.repository.JpaRepository;

//整合jpa：dao层接口必须继承JpaRepository，泛型为<T,ID>
//T --> 对哪个实体类进行操作
//ID --> 必须指定实体类的主键类型
public interface BookDao extends JpaRepository<Book,Integer> {



}
