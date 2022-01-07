package com.jeespring.sharding.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jeespring.sharding.entity.Order;

import java.util.List;

/**
 * OrderService
 *
 * @author 张朝阳
 * @date 2022/1/6 4:18 下午
 */
public interface OrderService {

    /**
     * 查询订单信息
     *
     * @param order
     * @return
     */
    List<Order> select(Order order);

    /**
     * 分页查询订单信息
     *
     * @param order
     * @param pageNumber
     * @param pageSize
     * @return
     */
    IPage<Order> selectPage(Order order , int pageNumber, int pageSize);

    /**
     * 更加用户Id查询全部订单
     * @return
     */
    List<Order> selectByUserId(Long userId);

    /**
     * 新增订单
     *
     * @param order
     * @return
     */
    int insert(Order order);

    /**
     * 根据订单Id删除订单
     *
     * @param id
     * @return
     */
    int deleteById(Long id);

    /**
     * 更新订单
     * @param order
     * @return
     */
    int update(Order order);
}
