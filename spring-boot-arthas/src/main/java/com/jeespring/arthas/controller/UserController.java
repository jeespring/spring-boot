package com.jeespring.arthas.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jeespring.arthas.entity.User;
import com.jeespring.arthas.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * UserController
 *
 * @author 张朝阳
 * @date 2023/1/8 23:12:12
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${server.port}")
    private int serverPort;

    private static int pageSize = 3;

    /**
     * 获取系统信息
     *
     * @return
     */
    @RequestMapping("/applicationInfo")
    public Map<String, Object> applicationName() {
        Map<String, Object> result = new HashMap<>();
        result.put("applicationName", applicationName);
        result.put("serverPort", serverPort);
        return result;
    }

    @RequestMapping("/selectPage")
    public Page<User> selectPage(int pageNo) throws Exception {
        return userService.selectPage(pageNo, pageSize);
    }
}
