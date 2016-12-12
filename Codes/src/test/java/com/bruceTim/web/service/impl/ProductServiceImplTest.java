package com.bruceTim.web.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import com.alibaba.fastjson.serializer.ValueFilter;
import com.bruceTim.web.model.Category;
import com.bruceTim.web.model.Product;
import com.bruceTim.web.service.ProductService;
import com.github.pagehelper.PageInfo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by BruceTim on 2016/12/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring.xml", "classpath:spring-mybatis.xml"})
public class ProductServiceImplTest {

    @Resource
    private ProductService productService;
    private Product product;

    @Before
    public void createProduct() throws Exception {
        product = new Product();
        product.setId(1L);
        product.setProductName("Smart Lids 10.5gram Replacement Caps For 5 Gallon Water Bottles 2 In 1");
        product.setPlaceOfOrigin("China");
        product.setBrandName("Jingli");
        product.setCertification("QS/SGS/FDA");
        product.setModelNumber("SZJL_045");
        product.setPaymentTerms("");
        product.setMinOrderQty("100000 pcs");
        product.setPrice("$0.04 ～$0.05");
        product.setPackagingDetails("Packed in plastic bag or carton");
        product.setDeliveryTime("10 working days after received your payment");
        product.setSupplyAbility("5,000,000pcs per month");
        JSONObject json = new JSONObject();
        json.put("Material", "Plastic(PE)");
        json.put("Color", "Customized");
        json.put("Diameter", "55.0mm");
        json.put("Performance", "Non Spill");
        json.put("Height", "35.5mm");
        json.put("Application", "55mm Bottle Neck");
        json.put("weight", "10.5gram");
        json.put("type", "Smart Lids");
        json.put("safe & Healthy", "Food Grade");
        product.setCustomProperties(json.toJSONString());
        Category category = new Category();
        category.setId(1L);
        product.setCategory(category);
        product.setCreateTime(new Date());
        product.setTag1("five gallon water bottle cap");
        product.setTag2("5 gal water bottle caps");
        product.setTag3("5 gallon water bottle cap");
        product.setPictures("");
        product.setContent("");
        product.setDescription("");
    }

    @Test
    public void insert () throws Exception {
        System.out.println(productService.insert(product));
    }

    @Test
    public void update () throws Exception {

    }

    @Test
    public void selectById () throws Exception {
        System.out.println(JSON.toJSONString(productService.selectById(2L)));
    }

    @Test
    public void selectAmountByCategoryId () throws Exception {
        System.out.println(productService.selectAmountByCategoryId(1L));
    }

    @Test
    public void selectListByCategoryId () throws Exception {
        PageInfo<Product> pageInfo = productService.selectListByCategoryId(1L, 1, 10);
        System.out.println(JSON.toJSONString(pageInfo));
    }

    @Test
    public void selectAdviceListByCategoryId () throws Exception {
        System.out.println(JSON.toJSONString(productService.selectAdviceListByCategoryId(0L)));
    }

    @Test
    public void selectListByCategoryIdAndName () throws Exception {
        System.out.println(JSON.toJSONString(productService.selectListByCategoryIdAndName(1L, "Water", 1, 10)));
    }

    @Test
    public void delete () throws Exception {
        System.out.println(productService.delete(2L));
    }

    @Test
    public void selectListByTag () throws Exception {
        System.out.println(JSON.toJSONString(productService.selectListByTag("five gallon water bottle cap", 1, 10)));
    }

}