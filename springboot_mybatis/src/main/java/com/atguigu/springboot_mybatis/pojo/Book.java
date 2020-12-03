package com.atguigu.springboot_mybatis.pojo;

import org.springframework.stereotype.Component;

@Component
public class Book {

    private Integer bookId;
    private String bookName;
    private Double price;

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                '}';
    }

    public Book(Integer bookId, String bookName, Double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    public Book() {
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
