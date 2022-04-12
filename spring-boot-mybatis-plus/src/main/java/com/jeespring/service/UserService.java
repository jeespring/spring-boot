package com.jeespring.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jeespring.entity.User;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author 张朝阳
 * @description UserService
 * @date 2022/3/14 18:40:40
 */
public interface UserService {

    // 查询
    User selectById(Long id);

    User selectOne(User user);

    List<User> selectBatchIds(List<Long> ids);

    List<User> selectAll();

    List<User> selectList(User user);

    Page<User> selectPage(User user, int pageNumber, int pageSize);

    List<User> selectByMap(User user);

    List<User> selectByName(String name);

    Page<User> selectPageByAge(User user,int pageNumber,int pageSize);

    int count(User user);

    // 添加
    int insert(User user);

    // 更新
    int update(User user);

    int updateById(User user);

    int deleteById(Long id);

    // 删除
    int delete(User user);

    int deleteByMap(User user);

    int deleteBatchIds(List<Long> ids);

    List<User> selectByNameAndCreateTimeRange(String name, String beginTime, String endTime);
}
