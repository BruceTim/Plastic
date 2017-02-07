package com.bruceTim.web.controller;

import com.alibaba.fastjson.JSON;
import com.bruceTim.core.entity.Result;
import com.bruceTim.web.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 公共视图控制器
 * 
 * @author starzou
 * @since 2014年4月15日 下午4:16:34
 **/
@Controller
public class CommonController {
    /**
     * 首页
     * 
     * @param request
     * @return
     */
    @RequestMapping("index")
    public String index(HttpServletRequest request) {
        return "index";
    }

    /**
     * 首页
     *
     * @param request
     * @return
     */
    @RequestMapping("admin/index")
    public String adminIndex(HttpSession session, HttpServletRequest request) {
        User user = (User)session.getAttribute("userInfo");
        if (user == null) {
            return "redirect:../admin/login";
        }
        return "admin/index";
    }

    /**
     * 现在联系我们
     *
     * @param model
     * @return
     */
    @RequestMapping("contactnow")
    public String contactnow(Model model,
           @RequestParam(value = "pid", defaultValue = "0", required = false) int pid,
           @RequestParam(value = "message", defaultValue = "", required = false) String message ) {
        model.addAttribute("pid", pid);
        model.addAttribute("message", message);
        return "contactnow";
    }

    /**
     *  关于我们
     * @param model
     * @return
     */
    @RequestMapping("aboutus")
    public String aboutus(Model model){
        return "aboutus";
    }

    /**
     *  关于我们
     * @param model
     * @return
     */
    @RequestMapping("factory")
    public String factory(Model model){
        return "factory";
    }

    /**
     *  关于我们
     * @param model
     * @return
     */
    @RequestMapping("quality")
    public String quality(Model model){
        return "quality";
    }

    /**
     *  关于我们
     * @param model
     * @return
     */
    @RequestMapping("contactus")
    public String contactus(Model model){
        return "contactus";
    }

    /**
     * 登录页
     */
    @RequestMapping("admin/login")
    public String login() {
        return "admin/login";
    }

    /**
     * 404页
     */
    @RequestMapping("404")
    public String error404() {
        return "404";
    }

    /**
     * 401页
     */
    @RequestMapping("401")
    public String error401() {
        return "401";
    }

    /**
     * 500页
     */
    @RequestMapping("500")
    public String error500() {
        return "500";
    }
}