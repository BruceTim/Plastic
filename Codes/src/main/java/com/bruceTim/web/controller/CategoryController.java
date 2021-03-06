package com.bruceTim.web.controller;

import com.alibaba.fastjson.JSON;
import com.bruceTim.core.entity.JSONResult;
import com.bruceTim.core.entity.Result;
import com.bruceTim.web.model.Category;
import com.bruceTim.web.model.User;
import com.bruceTim.web.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by BruceTim on 2016/12/13.
 */
@Controller("categories")
public class CategoryController {

    @Resource
    private CategoryService categoryService;

    /**
     * /categories, 获取所有类别
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String list() {
        List<Category> list = categoryService.selectList();
        Result result = new JSONResult<List<Category>>(list, "Success", true);
        return JSON.toJSONString(result);
    }

    /**
     * /categories/id 根据id获取类别详情
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String getById(@PathVariable("id") Long id) {
        Category category = categoryService.selectById(id);
        Result result = new JSONResult<Category>(category, "Success", true);
        return JSON.toJSONString(result);
    }

    /**
     * /categories， 类别添加
     * @param category
     * @param user
     * @param request
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public String add(@ModelAttribute Category category, @ModelAttribute User user, HttpServletRequest request) {
        if (user == null) {
            return JSON.toJSONString(new Result("你还未登录，请先登录！", 1, false));
        }
        int rs = categoryService.insert(category);
        if (rs > 0) {
            return JSON.toJSONString(new Result("Success", 0, true));
        }
        return JSON.toJSONString(new Result("Fail", 1, false));
    }

    /**
     * /categories， 类别添加检测
     * @param categoryName
     * @param user
     * @return
     */
    @RequestMapping(value = "/checking", method = RequestMethod.POST)
    @ResponseBody
    public String check(@ModelAttribute String categoryName, @ModelAttribute User user) {
        if (user == null) {
            return JSON.toJSONString(new Result("你还未登录，请先登录！", 1, false));
        }
        boolean flag = categoryService.selectByName(categoryName);
        if (flag) {
            return JSON.toJSONString(new Result("No Record", 0, true));
        }
        return JSON.toJSONString(new Result("Already exists", 1, false));
    }

    /**
     * /categories/id
     * @param category
     * @param user
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public String update(@PathVariable("id") Long id, @ModelAttribute Category category, @ModelAttribute User user) {
        if (user == null) {
            return JSON.toJSONString(new Result("你还未登录，请先登录！", 1, false));
        }
        category.setId(id);
        int rs = categoryService.update(category);
        if (rs > 0) {
            return JSON.toJSONString(new Result("Success", 0, true));
        }
        return JSON.toJSONString(new Result("Fail", 1, false));
    }
}
