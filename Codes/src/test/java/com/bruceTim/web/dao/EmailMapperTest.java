package com.bruceTim.web.dao;

import com.alibaba.fastjson.JSON;
import com.bruceTim.web.model.Email;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by BruceTim on 2016/12/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring.xml", "classpath:spring-mybatis.xml"})
public class EmailMapperTest {

    @Resource
    private EmailMapper emailMapper;

    private Email email;

    @Before
    public void createEmail() throws Exception {
        email = new Email();
        email.setId(1L);
//        email.setCreateTime(new Date());
//        email.setContent("dadsadasdas");
//        email.setUrgent(false);
//        email.setCompanyDescription(false);
//        email.setDeliverTime(false);
//        email.setInitialOrder("");
//        email.setSender("avadasa@qq.com");
//        email.setReceiver("bb@qq.com");
//        email.setSubject("adasdasfsg");
//        email.setTransfer("yteta@qq.com");
//        email.setState(1L);
    }


    @Test
    public void insert () throws Exception {
        System.out.println(emailMapper.insert(email));
    }

    @Test
    public void updateByPrimaryKey () throws Exception {
        System.out.println(emailMapper.updateByPrimaryKey(email));
    }


    @Test
    public void updateByPrimaryKeySelective () throws Exception {
        System.out.println(emailMapper.updateByPrimaryKeySelective(email));
    }

    @Test
    public void selectByPrimaryKey () throws Exception {
        System.out.println(JSON.toJSONString(emailMapper.selectByPrimaryKey(1L)));
    }

    @Test
    public void deleteByPrimaryKey () throws Exception {
        System.out.println(emailMapper.deleteByPrimaryKey(1L));
    }
}