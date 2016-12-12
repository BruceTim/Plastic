package com.bruceTim.web.service.impl;

import com.bruceTim.web.service.AdviceService;
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
public class AdviceServiceImplTest {

    @Resource
    private AdviceService adviceService;

    @Test
    public void deleteByCategoryId () throws Exception {

    }

    @Test
    public void insert () throws Exception {
        long[] productIds = {1L, 2L};
        System.out.println(adviceService.insert(0L, productIds));
    }

}