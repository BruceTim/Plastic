package com.bruceTim.web.service.impl;

import com.alibaba.fastjson.JSON;
import com.bruceTim.web.enums.EmailState;
import com.bruceTim.web.model.Email;
import com.bruceTim.web.service.EmailService;
import com.github.pagehelper.PageInfo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by BruceTim on 2016/12/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring.xml", "classpath:spring-mybatis.xml"})
public class EmailServiceImplTest {

    @Resource
    private EmailService emailService;

    private Email email;

    @Before
    public void createEmail() throws Exception {
        email = new Email();
        email.setId(1L);
        email.setCreateTime(new Date());
        email.setContent("dadsadasdas");
        email.setUrgent(false);
        email.setCompanyDescription(false);
        email.setDeliverTime(false);
        email.setInitialOrder("");
        email.setSender("avadasa@qq.com");
        email.setReceiver("abcd@qq.com");
        email.setSubject("adasdasfsg");
        email.setTransfer("yteta@qq.com");
        email.setState(EmailState.UNREAD);
    }

    @Test
    public void insert () throws Exception {
        System.out.println(emailService.insert(email));
    }

    @Test
    public void selectAll () throws Exception {
        PageInfo<Email> page = emailService.selectAll(1, 10);
        System.out.println(JSON.toJSONString(page));
    }

    @Test
    public void selectByState () throws Exception {
        PageInfo<Email> page = emailService.selectByState(EmailState.UNREAD, 1, 10);
        System.out.println(JSON.toJSONString(page));
    }

    @Test
    public void readEmail () throws Exception {
        System.out.println(JSON.toJSONString(emailService.readEmail(1L)));
    }

    @Test
    public void update () throws Exception {
        System.out.println(emailService.update(email));
    }

    @Test
    public void selectById () throws Exception {
        System.out.println(JSON.toJSONString(emailService.selectById(1L)));
    }

}