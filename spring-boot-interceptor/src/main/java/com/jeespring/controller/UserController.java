package com.jeespring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 *
 * @author 张朝阳
 * @date 2022/4/14 10:17 上午
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getUserInfo")
    public String getUserInfo(){
        return "前尘忆梦";
    }

    @RequestMapping("/login")
    public String login(){
        return "用户登录成功!";
    }

    @RequestMapping("/logout")
    public String logout(){
        return "注销成功";
    }
}
