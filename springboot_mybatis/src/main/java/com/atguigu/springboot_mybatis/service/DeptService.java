package com.atguigu.springboot_mybatis.service;

import com.atguigu.springboot_mybatis.dao.DeptMapper;
import com.atguigu.springboot_mybatis.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DeptService {

    @Autowired
    private DeptMapper deptMapper;

    public List<Dept> getDeptList(){
        return deptMapper.getDepList();
    }

}
