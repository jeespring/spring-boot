package com.jeespring.arthas.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jeespring.arthas.entity.User;
import com.jeespring.arthas.mapper.UserMapper;
import com.jeespring.arthas.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Random;

/**
 * UserServiceImpl
 *
 * @author 张朝阳
 * @date 2023/1/8 23:11:11
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    private static long default_time = 1000L;

    @Override
    public Page<User> selectPage(int pageNo, int pageSize) throws Exception {
        Random rand = new Random();
        int randNum = rand.nextInt(1000);
        Thread.sleep(default_time + randNum);
        Page<User> page = new Page(pageNo, pageSize);
        Wrapper<User> wapper = new QueryWrapper<>();
        return userMapper.selectPage(page, wapper);
    }
}
