package com.bruceTim.web.service.impl;

import com.alibaba.fastjson.JSON;
import com.bruceTim.web.model.Category;
import com.bruceTim.web.service.CategoryService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by BruceTim on 2016/12/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring.xml", "classpath:spring-mybatis.xml"})
public class CategoryServiceImplTest {

    @Resource
    private CategoryService categoryService;

    private Category category;

    @Before
    public void create() throws Exception {
        category = new Category();
        category.setId(2L);
        category.setCategoryName("5 Gallon Water Bottle Caps");
    }

    @Test
    public void insert () throws Exception {
        System.out.println(categoryService.insert(category));
    }

    @Test
    public void update () throws Exception {
        category.setId(1L);
        category.setCategoryName("Plastic Water Bottle Caps");
        System.out.println(categoryService.update(category));
    }

    @Test
    public void delete () throws Exception {
        System.out.println(categoryService.delete(2L));
    }

    @Test
    public void selectById () throws Exception {
        System.out.println(JSON.toJSONString(categoryService.selectById(1L)));
    }

    @Test
    public void selectList () throws Exception {
        System.out.println(JSON.toJSONString(categoryService.selectList()));
    }

    @Test
    public void selectByName () throws Exception {
        System.out.println(JSON.toJSONString(categoryService.selectByName("Plastic")));
        System.out.println(JSON.toJSONString(categoryService.selectByName("Plastic Water Bottle Caps")));
    }

}