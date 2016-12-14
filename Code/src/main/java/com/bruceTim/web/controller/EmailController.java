package com.bruceTim.web.controller;

import com.alibaba.fastjson.JSON;
import com.bruceTim.core.entity.JSONResult;
import com.bruceTim.core.entity.Result;
import com.bruceTim.web.enums.EmailState;
import com.bruceTim.web.model.Email;
import com.bruceTim.web.model.User;
import com.bruceTim.web.service.EmailService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by BruceTim on 2016/12/13.
 */
@Controller
@RequestMapping("/emails")
public class EmailController {

    @Resource
    private EmailService emailService;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public String add(@ModelAttribute Email email){
        int rs = emailService.insert(email);
        if (rs > 0) {
            return JSON.toJSONString(new Result("Success", 0, true));
        }
        return JSON.toJSONString(new Result("Fail", 1, false));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String detail(@PathVariable("id") Long id, @ModelAttribute User user) {
        if (user == null) {
            return JSON.toJSONString(new Result("你还未登录，请先登录！", 1, false));
        }
        Email email = emailService.readEmail(id);
        return JSON.toJSONString(new JSONResult<Email>(email, "Success", true));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public String update(@PathVariable("id") Long id, @RequestParam(value = "state", defaultValue = "1") int state, @ModelAttribute User user) {
        if (user == null) {
            return JSON.toJSONString(new Result("你还未登录，请先登录！", 1, false));
        }
        int rs = 0;
        if (id > 0) {
            Email email = new Email();
            email.setId(id);
            email.setState(EmailState.value(state));
            rs = emailService.update(email);
        } else {
            rs = emailService.updateAll(state);
        }
        if (rs > 0) {
            return JSON.toJSONString(new Result("Success", 0, true));
        }
        return JSON.toJSONString(new Result("Fail", 1, false));
    }

    @RequestMapping(value = "/states", method = RequestMethod.GET)
    @ResponseBody
    public String states(@ModelAttribute User user) {
        return EmailState.valuesForJson();
    }

    @RequestMapping(value = "/states/{state}", method = RequestMethod.GET)
    @ResponseBody
    public String queryForState(@PathVariable("state") int state, @ModelAttribute User user, @RequestParam(value = "pageNum", defaultValue = "1") int pageNum, @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
        if (user == null) {
            return JSON.toJSONString(new Result("你还未登录，请先登录！", 1, false));
        }
        PageInfo<Email> pageInfo = null;
        if (state > 0) {
            emailService.selectByState(EmailState.value(state), pageNum, pageSize);
        } else {
            emailService.selectAll( pageNum, pageSize);
        }
        return JSON.toJSONString(new JSONResult<PageInfo>(pageInfo, "Success", true));
    }

}

