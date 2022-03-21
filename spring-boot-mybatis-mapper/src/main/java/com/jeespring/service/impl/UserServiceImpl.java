package com.jeespring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jeespring.entity.User;
import com.jeespring.entity.UserExample;
import com.jeespring.mapper.UserMapper;
import com.jeespring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 张朝阳
 * @description UserServiceImpl
 * @date 2022/3/14 18:41:41
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectByPrimaryKey(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public User selectOne(User user) {
        return userMapper.selectOne(user);
    }

    @Override
    public List<User> select(User user) {
        return userMapper.select(user);
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public int selectList(User user) {
        return userMapper.selectCount(user);
    }

    @Override
    public List<User> selectByExample(User user) {
        UserExample example = new UserExample();
        example.createCriteria().andNameEqualTo(user.getName());
        return userMapper.selectByExample(example);
    }

    @Override
    public PageInfo<User> selectPage(User user, int pageNumber, int pageSize) {
        PageHelper.startPage(pageNumber,pageSize);
        List<User> userList = userMapper.select(user);
        PageInfo<User> pageInfo = new PageInfo<>(userList);
        return pageInfo;
    }

    @Override
    public List<User> selectByName(String name) {
        return userMapper.selectByName(name);
    }

    @Override
    public int selectCount(User user) {
        return userMapper.selectCount(user);
    }

    /**
     * 新增数据
     * @param user
     * @return
     */
    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    /**
     * 新增数据，过滤不为空的字段
     * @param user
     * @return
     */
    @Override
    public int insertSelective(User user) {
        return userMapper.insertSelective(user);
    }

    /**
     * 更新
     */

    /**
     * 根据主键更新全部字段
     * @param user
     * @return
     */
    @Override
    public int updateByPrimaryKey(User user) {
        return userMapper.updateByPrimaryKey(user);
    }

    /**
     * 根据主键更新不为空的字段
     * @param user
     * @return
     */
    @Override
    public int updateByPrimaryKeySelective(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }


    /**
     * 删除
     */

    /**
     * 根据Id删除
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Long id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    /**
     * 根据条件删除
     * @param user
     * @return
     */
    @Override
    public int delete(User user) {
        return userMapper.delete(user);
    }

    /**
     * 根据条件删除
     * @param user
     * @return
     */
    @Override
    public int deleteByExample(User user) {
        UserExample example = new UserExample();
        example.createCriteria().andNameEqualTo(user.getName());
        return userMapper.deleteByExample(example);
    }

}
