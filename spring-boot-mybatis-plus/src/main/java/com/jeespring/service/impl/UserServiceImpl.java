package com.jeespring.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jeespring.entity.User;
import com.jeespring.mapper.UserMapper;
import com.jeespring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public User selectById(Long id) {
        return userMapper.selectById(id);
    }

    @Override
    public User selectOne(User user) {
        QueryWrapper<User> wapper = new QueryWrapper<>();
        wapper.eq("id", user.getId());
        return userMapper.selectOne(wapper);
    }

    @Override
    public List<User> selectBatchIds(List<Long> ids) {
        return userMapper.selectBatchIds(ids);
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectList(null);
    }

    @Override
    public List<User> selectList(User user) {
        QueryWrapper<User> wapper = new QueryWrapper<>();
        wapper.eq("name", user.getName());
        return userMapper.selectList(wapper);
    }

    @Override
    public IPage<User> selectPage(User user, int pageNumber, int pageSize) {
        IPage<User> page = new Page(pageNumber, pageSize);
        Wrapper<User> wapper = new QueryWrapper<>();
        return userMapper.selectPage(page, wapper);
    }

    @Override
    public List<User> selectByMap(User user) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", user.getName());
        return userMapper.selectByMap(map);
    }

    @Override
    public int count(User user) {
        QueryWrapper<User> wapper = new QueryWrapper<>();
        wapper.eq("name", user.getName());
        return userMapper.selectCount(wapper);
    }


    @Override
    public List<User> selectByName(String name) {
        return userMapper.selectByName(name);
    }

    @Override
    public IPage<User> selectPageByAge(User user, int pageNumber, int pageSize) {
        IPage<User> page = new Page(pageNumber, pageSize);
        return userMapper.selectPageByAge(page, user);
    }

    /**
     * 新增数据
     *
     * @param user
     * @return
     */
    @Override
    public int insert(User user) {
        int insert = userMapper.insert(user);
        return insert;
    }

    /**
     * 更新
     */

    /**
     * 根据条件更新
     *
     * @param user
     * @return
     */
    @Override
    public int update(User user) {
        UpdateWrapper<User> wapper = new UpdateWrapper<>();
        wapper.eq("email", user.getEmail());
        return userMapper.update(user, wapper);
    }

    /**
     * 根据Id修改信息
     *
     * @param user
     * @return
     */
    @Override
    public int updateById(User user) {
        return userMapper.updateById(user);
    }


    /**
     * 删除
     */

    /**
     * 根据Id删除
     *
     * @param id
     * @return
     */
    @Override
    public int deleteById(Long id) {
        return userMapper.deleteById(id);
    }

    /**
     * 根据条件批量删除
     *
     * @param user
     * @return
     */
    @Override
    public int delete(User user) {
        QueryWrapper<User> wapper = new QueryWrapper<>();
        wapper.eq("id", user.getId());
        return userMapper.delete(wapper);
    }

    /**
     * 根据map批量删除
     *
     * @param user
     * @return
     */
    @Override
    public int deleteByMap(User user) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", user.getId());
        return userMapper.deleteByMap(map);
    }

    /**
     * 根据id批量删除
     *
     * @param ids
     * @return
     */
    @Override
    public int deleteBatchIds(List<Long> ids) {
        return userMapper.deleteBatchIds(ids);
    }

}
