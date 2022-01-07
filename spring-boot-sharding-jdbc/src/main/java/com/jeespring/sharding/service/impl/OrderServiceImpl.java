package com.jeespring.sharding.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jeespring.sharding.entity.Order;
import com.jeespring.sharding.mapper.OrderMapper;
import com.jeespring.sharding.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * OrderServiceImpl
 *
 * @author 张朝阳
 * @date 2022/1/6 4:20 下午
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public List<Order> select(Order order) {
        QueryWrapper<Order> queryWapper = new QueryWrapper<>();
        queryWapper.setEntity(order);
        return orderMapper.selectList(queryWapper);
    }

    @Override
    public IPage<Order> selectPage(Order order, int pageNumber, int pageSize) {
        IPage<Order> page = new Page<>();
        Wrapper<Order> queryWapper = new QueryWrapper<>();
        return orderMapper.selectPage(page, queryWapper);
    }

    @Override
    public List<Order> selectByUserId(Long userId) {
        return orderMapper.selectByUserId(userId);
    }

    @Override
    public int insert(Order order) {
        return orderMapper.insert(order);
    }

    @Override
    public int deleteById(Long id) {
        return orderMapper.deleteById(id);
    }

    @Override
    public int update(Order order) {
        UpdateWrapper<Order> wapper = new UpdateWrapper<>();
        wapper.eq("id", order.getId());
        return orderMapper.update(order, wapper);
    }
}

