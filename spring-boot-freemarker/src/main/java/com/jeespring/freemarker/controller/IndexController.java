package com.jeespring.freemarker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * IndexController
 *
 * @author 张朝阳
 * @date 2022/4/25 22:20:20
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping({"/", "/index"})
    public String index() {
        return "index";
    }
}
