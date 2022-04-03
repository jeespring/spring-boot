package com.jeespring.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 *
 * @author 张朝阳
 * @date 2022/3/14 1:13:13
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/select")
    public String select(){
        return "success";
    }
}
