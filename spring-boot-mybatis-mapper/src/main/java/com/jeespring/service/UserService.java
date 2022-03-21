package com.jeespring.service;

import com.github.pagehelper.PageInfo;
import com.jeespring.entity.User;

import java.util.List;

/**
 * @author 张朝阳
 * @description UserService
 * @date 2022/3/14 18:40:40
 */
public interface UserService {

    User selectByPrimaryKey(Long id);

    User selectOne(User user);

    List<User> select(User user);

    List<User> selectAll();

    int selectList(User user);

    List<User> selectByExample(User user);

    PageInfo<User> selectPage(User user, int pageNumber, int pageSize);

    List<User> selectByName(String name);

    int selectCount(User user);

    int insert(User user);

    int insertSelective(User user);

    int updateByPrimaryKey(User user);

    int updateByPrimaryKeySelective(User user);

    int deleteByPrimaryKey(Long id);

    int delete(User user);

    int deleteByExample(User user);
}
