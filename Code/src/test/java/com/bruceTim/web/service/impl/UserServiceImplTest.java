package com.bruceTim.web.service.impl;

import com.alibaba.fastjson.JSON;
import com.bruceTim.web.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by BruceTim on 2016/12/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring.xml", "classpath:spring-mybatis.xml"})
public class UserServiceImplTest {

    @Resource
    private UserService userService;

    @Test
    public void insert() throws Exception {

    }
     @Test
    public void update() throws Exception {

    }
     @Test
    public void delete() throws Exception {

    }
     @Test
    public void selectById() throws Exception {
         System.out.println(JSON.toJSONString(userService.selectById(1001L)));
    }
     @Test
    public void selectList() throws Exception {

    }
     @Test
    public void selectByUsername() throws Exception {
         System.out.println(JSON.toJSONString(userService.selectByUsername("admin")));
    }
     @Test
    public void login() throws Exception {
        try {
//            System.out.println(JSON.toJSONString(userService.login("admin", "123456")));
            System.out.println(JSON.toJSONString(userService.login("admin", "12345678")));
        } catch (Exception UnknownAccountException){
            System.out.println("用户名密码错误");
        }

    }

}