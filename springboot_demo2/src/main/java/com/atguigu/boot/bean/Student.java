package com.atguigu.boot.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Component
@ConfigurationProperties(prefix = "student")
//@ConfigurationProperties注解作用：将springboot配置文件中以指定的前缀开头的属性对应的值赋给当前类对象的属性
public class Student {

    //    @Value("${student.id}")
    private Integer id;
    //    @Value("${student.name}")
    private String name;
    //    @Value("${student.age}")
    private Integer age;
    //    @Value("${student.gender}")
    private boolean gender;
    //    @Value("${student.birth}")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birth;

    private Book book;

    private List<String> animals;

    private Set<String> hobby;

    private List<Book> books;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", birth=" + birth +
                ", book=" + book +
                ", animals=" + animals +
                ", hobby=" + hobby +
                ", books=" + books +
                '}';
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Student(Integer id, String name, Integer age, boolean gender, Date birth, Book book, List<String> animals, Set<String> hobby, List<Book> books) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.birth = birth;
        this.book = book;
        this.animals = animals;
        this.hobby = hobby;
        this.books = books;
    }

    public List<String> getAnimals() {
        return animals;
    }

    public void setAnimals(List<String> animals) {
        this.animals = animals;
    }

    public Set<String> getHobby() {
        return hobby;
    }

    public void setHobby(Set<String> hobby) {
        this.hobby = hobby;
    }

    public Student(Integer id, String name, Integer age, boolean gender, Date birth, Book book, List<String> animals, Set<String> hobby) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.birth = birth;
        this.book = book;
        this.animals = animals;
        this.hobby = hobby;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Student(Integer id, String name, Integer age, boolean gender, Date birth, Book book) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.birth = birth;
        this.book = book;
    }

    public Student(Integer id, String name, Integer age, boolean gender, Date birth) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.birth = birth;
    }

    public Student() {
    }

}
