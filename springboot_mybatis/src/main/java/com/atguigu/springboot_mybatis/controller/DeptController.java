package com.atguigu.springboot_mybatis.controller;

import com.atguigu.springboot_mybatis.pojo.Dept;
import com.atguigu.springboot_mybatis.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/list")
    public List<Dept> getDeptList(){
        return deptService.getDeptList();
    }

}
