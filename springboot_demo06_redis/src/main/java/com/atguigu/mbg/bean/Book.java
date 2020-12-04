package com.atguigu.mbg.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class Book implements Serializable {
    private Integer bookid;

    private String bookname;

    private BigDecimal price;

    private static final long serialVersionUID = 1L;

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}