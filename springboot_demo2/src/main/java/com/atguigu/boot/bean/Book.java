package com.atguigu.boot.bean;

import org.springframework.stereotype.Component;

@Component
public class Book {

    private String bookName;
    private Integer bookId;
    private Double price;

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookId=" + bookId +
                ", price=" + price +
                '}';
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Book(String bookName, Integer bookId, Double price) {
        this.bookName = bookName;
        this.bookId = bookId;
        this.price = price;
    }

    public Book() {
    }
}
