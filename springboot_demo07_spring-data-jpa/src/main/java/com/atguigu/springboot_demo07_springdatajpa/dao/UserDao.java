package com.atguigu.springboot_demo07_springdatajpa.dao;

import com.atguigu.springboot_demo07_springdatajpa.pojo.User;

public interface UserDao extends JpaRepository<User,Integer>{
}
