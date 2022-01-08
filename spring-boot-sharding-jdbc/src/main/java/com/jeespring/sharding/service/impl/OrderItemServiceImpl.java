package com.jeespring.sharding.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jeespring.sharding.entity.OrderItem;
import com.jeespring.sharding.mapper.OrderItemMapper;
import com.jeespring.sharding.service.OrderItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * OrderItemServiceImpl
 *
 * @author 张朝阳
 * @date 2022/1/7 3:24 下午
 */
@Service
public class OrderItemServiceImpl implements OrderItemService {

    @Resource
    private OrderItemMapper orderItemMapper;

    @Override
    public List<OrderItem> select(OrderItem orderItem) {
        QueryWrapper<OrderItem> queryWapper = new QueryWrapper<>();
        queryWapper.setEntity(orderItem);
        return orderItemMapper.selectList(queryWapper);
    }

    @Override
    public IPage<OrderItem> selectPage(OrderItem orderItem, int pageNumber, int pageSize) {
        IPage<OrderItem> page = new Page<>();
        Wrapper<OrderItem> queryWapper = new QueryWrapper<>();
        return orderItemMapper.selectPage(page, queryWapper);
    }

    @Override
    public List<OrderItem> selectByUserId(Long userId) {
        return orderItemMapper.selectByUserId(userId);
    }

    @Override
    public int insert(OrderItem orderItem) {
        return orderItemMapper.insert(orderItem);
    }

    @Override
    public int deleteById(Long id) {
        return orderItemMapper.deleteById(id);
    }

    @Override
    public int update(OrderItem orderItem) {
        UpdateWrapper<OrderItem> wapper = new UpdateWrapper<>();
        wapper.eq("id", orderItem.getId());
        return orderItemMapper.update(orderItem, wapper);
    }
}
