package com.atguigu.service;

import com.atguigu.bean.Book;
import com.atguigu.dao.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BookService {

    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    public List<Book> getBookList(){
        //先去redis中查
        List<Book> returnList = (List<Book>) redisTemplate.opsForValue().get("list");
        //判断是否为空，空则表名redis中没有此数据
        if(returnList == null){
            //redis中没有，则去数据库中查询，返回给returnList
            synchronized (this) {
                //进锁，先查redis中该数据是什么
                returnList = (List<Book>) redisTemplate.opsForValue().get("list");
                //如果仍然位空，则去数据库中查
                if(returnList == null) {
                    returnList = bookMapper.getBookList();
                    //再把returnList放入redis层，让下次查询可以直接从redis查出
                    redisTemplate.opsForValue().set("list", returnList);
                }
            }
        }
        return returnList;
    }
}
