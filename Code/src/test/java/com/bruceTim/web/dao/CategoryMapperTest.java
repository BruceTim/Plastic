package com.bruceTim.web.dao;

import com.alibaba.fastjson.JSON;
import com.bruceTim.web.model.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by BruceTim on 2016/12/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring.xml", "classpath:spring-mybatis.xml"})
public class CategoryMapperTest {

    @Resource
    private CategoryMapper categoryMapper;

    @Test
    public void selectAll () throws Exception {
        System.out.println(JSON.toJSONString(categoryMapper.selectAll()));
    }

    @Test
    public void selectSelective () throws Exception {
        Category category = new Category();
        category.setCategoryName("Plastic Water Bottle");
        System.out.println(JSON.toJSONString(categoryMapper.selectSelective(category)));
    }

    @Test
    public void insert () throws Exception {
        Category category = new Category();
        category.setId(1L);
        category.setCategoryName("Water");
        System.out.println(categoryMapper.insert(category));
    }

    @Test
    public void updateByPrimaryKey () throws Exception {
        Category category = new Category();
        category.setId(1L);
        category.setCategoryName("Water Bottle");
        System.out.println(categoryMapper.updateByPrimaryKey(category));
        category.setCategoryName("Plastic Water Bottle");
        System.out.println(categoryMapper.updateByPrimaryKeySelective(category));
    }

}