package com.jeespring.arthas.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jeespring.arthas.entity.User;

/**
 * UserService
 *
 * @author 张朝阳
 * @date 2023/1/8 23:22
 */
public interface UserService {

    Page<User> selectPage(int pageNo, int pageSize) throws Exception;
}
