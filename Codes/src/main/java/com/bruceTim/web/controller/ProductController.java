package com.bruceTim.web.controller;

import com.alibaba.fastjson.JSON;
import com.bruceTim.core.entity.JSONResult;
import com.bruceTim.core.entity.Result;
import com.bruceTim.web.model.Product;
import com.bruceTim.web.model.User;
import com.bruceTim.web.service.AdviceService;
import com.bruceTim.web.service.ProductService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by BruceTim on 2016/12/13.
 */
@Controller("/products")
public class ProductController {

    @Resource
    private ProductService productService;

    @Resource
    private AdviceService adviceService;

    @RequestMapping(value = "/{id}/amount", method = RequestMethod.GET)
    @ResponseBody
    public String getAmount(@PathVariable("id") Long id) {
        int amount = productService.selectAmountByCategoryId(id);
        return JSON.toJSONString(new JSONResult<Integer>(amount, "Success", true));
    }

    @RequestMapping(value = "/categories/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String queryByCategoryId(@PathVariable("id") Long id, @RequestParam(value = "pageNum", defaultValue = "1") int pageNum, @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {

        PageInfo<Product> pageInfo = productService.selectListByCategoryId(id, pageNum, pageSize);
        return JSON.toJSONString(new JSONResult<PageInfo>(pageInfo, "Success", true));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String detail(@PathVariable("id") Long id) {
        Product product = productService.selectById(id);
        return JSON.toJSONString(new JSONResult<Product>(product, "Success", true));
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public String add(@ModelAttribute Product product, @ModelAttribute User user, HttpServletRequest request) {
        if (user == null) {
            return JSON.toJSONString(new Result("你还未登录，请先登录！", 1, false));
        }
        int rs = productService.insert(product);
        if (rs > 0) {
            return JSON.toJSONString(new Result("Success", 0, true));
        }
        return JSON.toJSONString(new Result("Fail", 1, false));
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public String update(@PathVariable("id") Long id, @ModelAttribute Product product, @ModelAttribute User user) {
        if (user == null) {
            return JSON.toJSONString(new Result("你还未登录，请先登录！", 1, false));
        }
        int rs = productService.update(product);
        if (rs > 0) {
            return JSON.toJSONString(new Result("Success", 0, true));
        }
        return JSON.toJSONString(new Result("Fail", 1, false));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable("id") Long id, @ModelAttribute User user) {
        if (user == null) {
            return JSON.toJSONString(new Result("你还未登录，请先登录！", 1, false));
        }
        int rs = productService.delete(id);
        if (rs > 0) {
            return JSON.toJSONString(new Result("Success", 0, true));
        }
        return JSON.toJSONString(new Result("Fail", 1, false));
    }

    @RequestMapping(value = "/categories/{id}/advices", method = RequestMethod.GET)
    @ResponseBody
    public String queryAdvice(@PathVariable("id") Long id, @RequestParam(value = "productIds", defaultValue = "null") Long[] productIds, @ModelAttribute User user ) {
        if (user == null) {
            return JSON.toJSONString(new Result("你还未登录，请先登录！", 1, false));
        }
        List<Product> list = productService.selectAdviceListByCategoryId(id);
        return JSON.toJSONString(new JSONResult<List>(list, "Success", true));
    }

    @RequestMapping(value = "/categories/{id}/advices", method = RequestMethod.PUT)
    @ResponseBody
    public String updateAdvice(@PathVariable("id") Long id, @RequestParam(value = "productIds", defaultValue = "null") long[] productIds, @ModelAttribute User user ) {
        if (user == null) {
            return JSON.toJSONString(new Result("你还未登录，请先登录！", 1, false));
        }
        int rs = adviceService.insert(id, productIds);
        if (rs > 0) {
            return JSON.toJSONString(new Result("Success", 0, true));
        }
        return JSON.toJSONString(new Result("Fail", 1, false));
    }

    @RequestMapping(value = "/categories/{id}/search/{name}", method = RequestMethod.GET)
    @ResponseBody
    public String search(@PathVariable("id") Long id, @PathVariable("name") String name, @RequestParam(value = "pageNum", defaultValue = "1") int pageNum, @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
        PageInfo<Product> pageInfo = productService.selectListByCategoryIdAndName(id, name, pageNum, pageSize);
        return JSON.toJSONString(new JSONResult<PageInfo>(pageInfo, "Success", true));
    }

    @RequestMapping(value = "/tags/{tag}", method = RequestMethod.GET)
    @ResponseBody
    public String queryByTags(@PathVariable("tag") String tag, @RequestParam(value = "pageNum", defaultValue = "1") int pageNum, @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
        PageInfo<Product> pageInfo = productService.selectListByTag(tag, pageNum, pageSize);
        return JSON.toJSONString(new JSONResult<PageInfo>(pageInfo, "Success", true));
    }
}
