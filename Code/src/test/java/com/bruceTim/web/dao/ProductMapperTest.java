package com.bruceTim.web.dao;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bruceTim.web.model.Category;
import com.bruceTim.web.model.Product;
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
public class ProductMapperTest {

    @Resource
    private ProductMapper productMapper;

    private Product product;

    @Before
    public void createProduct() throws Exception{
        product = new Product();
//        product.setId(1L);
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

        System.out.println(productMapper.insert(product));
    }

    @Test
    public void updateByPrimaryKey () throws Exception {
        System.out.println(productMapper.updateByPrimaryKey(product));
    }

    @Test
    public void insertSelective () throws Exception {

    }

    @Test
    public void updateByPrimaryKeySelective () throws Exception {
        System.out.println(productMapper.updateByPrimaryKeySelective(product));
    }

    @Test
    public void deleteByPrimaryKey () throws Exception {
        System.out.println(productMapper.deleteByPrimaryKey(2L));
    }

    @Test
    public void selectByPrimaryKey () throws Exception {
        System.out.println(JSON.toJSONString(productMapper.selectByPrimaryKey(1L)));
    }
}