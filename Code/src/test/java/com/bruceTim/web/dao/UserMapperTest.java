package com.bruceTim.web.dao;

import com.alibaba.fastjson.JSON;
import com.bruceTim.core.util.PasswordHelper;
import com.bruceTim.web.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by BruceTim on 2016/12/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring.xml", "classpath:spring-mybatis.xml"})
public class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void deleteByPrimaryKey () throws Exception {

    }

    @Test
    public void insert () throws Exception {
        User user = new User();
        user.setId(1001L);
        user.setUsername("admin");
        user.setPassword("123456");
        user.setCreateTime(new Date());
        user.setPhone("+8618588203560");
        user.setEmail("694040432@qq.com");
        PasswordHelper.encryptPassword(user, PasswordHelper.algorithmName_MD5, 2);
        System.out.println(userMapper.insert(user));
    }

    @Test
    public void insertSelective () throws Exception {
        User user = new User();
        user.setUsername("abc");
        user.setPassword("123456");
        user.setCreateTime(new Date());
        user.setPhone("+8618588203560");
        user.setEmail("694040432@qq.com");
        PasswordHelper.encryptPassword(user, PasswordHelper.algorithmName_MD5, 2);
        System.out.println(userMapper.insert(user));
    }

    @Test
    public void selectByPrimaryKey () throws Exception {
        User user = userMapper.selectByPrimaryKey(1002L);
        System.out.println(JSON.toJSONString(user));
    }

    @Test
    public void selectBySelective () throws Exception {
        User user = new User();
        user.setUsername("abc");
        User user1 = userMapper.selectBySelective(user);
        System.out.println(JSON.toJSONString(user1));
//        PasswordHelper.changePassword(user1,PasswordHelper.algorithmName_MD5, 2,"");
    }

    @Test
    public void updateByPrimaryKeySelective () throws Exception {
        User user = new User();
        user.setId(1002L);
        user.setPassword("12345678");
        PasswordHelper.encryptPassword(user, PasswordHelper.algorithmName_MD5, 2);
        System.out.println(userMapper.updateByPrimaryKeySelective(user));
        System.out.println(JSON.toJSONString(userMapper.selectByPrimaryKey(1002L)));

    }

    @Test
    public void updateByPrimaryKey () throws Exception {
        User user = userMapper.selectByPrimaryKey(1002L);
        System.out.println(JSON.toJSONString(user));
        user.setPassword("123456");
        PasswordHelper.encryptPassword(user, PasswordHelper.algorithmName_MD5, 2);
        System.out.println(userMapper.updateByPrimaryKey(user));
        System.out.println(JSON.toJSONString(userMapper.selectByPrimaryKey(1002L)));
    }

}