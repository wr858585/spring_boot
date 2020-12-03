package com.atguigu.springboot_mybatis.dao;


import com.atguigu.springboot_mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptMapper {

    @Select("select * from dept")
    public List<Dept> getDepList();

}
