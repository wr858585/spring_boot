package com.atguigu.springboot_demo07_springdatajpa.pojo;

import javax.persistence.*;

@Entity //创建一个类对象
@Table(name = "book") //指定数据库中表的名字
public class Book {

    @Id //表名这个属性是主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //表示使用数据表的自增主键
    @Column(name = "bookId") //表名映射到的是数据表的bookId项
    private Integer bookId;

    @Column(name = "bookName")
    private String bookName;

    @Column(name = "price")
    private Double price;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
