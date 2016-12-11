package com.bruceTim.web.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by BruceTim on 2016/12/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring.xml", "classpath:spring-mybatis.xml"})
public class AdviceMapperTest {

    @Resource
    private AdviceMapper adviceMapper;

    @Test
    public void deleteByCategoryId () throws Exception {
        System.out.println(adviceMapper.deleteByCategoryId(0L));
    }

    @Test
    public void insert () throws Exception {
        long[] productids = {1L};
        System.out.println(adviceMapper.insert(0, productids));
    }

}