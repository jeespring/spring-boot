package com.jeespring.sharding.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jeespring.sharding.entity.OrderItem;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * OrderItemService
 *
 * @author 张朝阳
 * @date 2022/1/7 3:24 下午
 */
public interface OrderItemService {
    /**
     * 查询订单信息
     *
     * @param orderItem
     * @return
     */
    List<OrderItem> select(OrderItem orderItem);

    /**
     * 分页查询订单信息
     *
     * @param orderItem
     * @param pageNumber
     * @param pageSize
     * @return
     */
    IPage<OrderItem> selectPage(OrderItem orderItem , int pageNumber, int pageSize);

    /**
     * 更加用户Id查询全部订单
     * @return
     */
    List<OrderItem> selectByUserId(Long userId);

    /**
     * 新增订单
     *
     * @param orderItem
     * @return
     */
    int insert(OrderItem orderItem);

    /**
     * 根据订单Id删除订单
     *
     * @param id
     * @return
     */
    int deleteById(Long id);

    /**
     * 更新订单
     * @param orderItem
     * @return
     */
    int update(OrderItem orderItem);
}
