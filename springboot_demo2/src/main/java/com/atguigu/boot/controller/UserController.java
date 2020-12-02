package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Book;
import com.atguigu.boot.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private Student student;

    @Autowired
//    private Book book;    --> 报错：因为@Autowired会先按照类型去找，有两个Book的bean，所以报错
    private Book getBookObject;//用name指定，可以找到唯一，所以ok
    @Autowired
    private Book abc;//用别名找，也可

    @RequestMapping("/info")
    public Map<String, Object> userInfo() {
        Map<String, Object> map = new HashMap<>();
        map.put("演员1", "庄熙1");
        map.put("演员2", "庄熙2");
        map.put("演员3", "庄熙3");
        System.out.println(getBookObject);
        System.out.println(abc);
        System.out.println(student);
        return map;
    }

}
