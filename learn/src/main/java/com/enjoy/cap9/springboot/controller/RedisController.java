package com.enjoy.cap9.springboot.controller;


import com.enjoy.cap9.springboot.redis.RedisUtil;
import com.enjoy.mybatis.entity.TUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: springbootdemo
 * @Date: 2019/2/22 15:03
 * @Author: zjjlive
 * @Description:
 */

@RestController
@RequestMapping("redis/")
public class RedisController {

    private static int ExpireTime = 60;   // redis中存储的过期时间60s

    @Resource
    private RedisUtil redisUtil;

    @RequestMapping("set")
    public boolean redisset(String key, String value){
        TUser userEntity =new TUser();
        userEntity.setId(Integer.valueOf(1));
        userEntity.setUserName("username");
        userEntity.setRealName("zhangsan");
        userEntity.setMobile(String.valueOf(20));
        return redisUtil.set("1",userEntity);
    }

        @RequestMapping("get")
        public Object redisget(String key){
            return redisUtil.get("1");
        }

        @RequestMapping("expire")
        public boolean expire(String key){
            return redisUtil.expire(key,ExpireTime);
        }
}