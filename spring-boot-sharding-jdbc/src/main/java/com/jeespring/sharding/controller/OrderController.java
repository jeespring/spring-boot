package com.jeespring.sharding.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jeespring.sharding.entity.Order;
import com.jeespring.sharding.service.OrderService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * OrderController
 *
 * @author 张朝阳
 * @date 2022/1/6 4:15 下午
 */

@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    /**
     * 查询订单信息
     *
     * @param order
     * @return
     */
    @RequestMapping("/select")
    public List<Order> select(@RequestBody Order order) {
        return orderService.select(order);
    }

    /**
     * 分页查询订单信息
     *
     * @param order
     * @param pageNumber
     * @param pageSize
     * @return
     */
    @RequestMapping("/selectPage")
    public IPage<Order> selectPage(@RequestBody Order order, int pageNumber, int pageSize) {
        return orderService.selectPage(order, pageNumber, pageSize);
    }

    /**
     * 更加用户Id查询全部订单
     * @param userId
     * @return
     */
    @RequestMapping("/selectByUserId")
    public List<Order> selectByUserId(Long userId) {
        return orderService.selectByUserId(userId);
    }

    /**
     * 新增订单
     *
     * @param order
     * @return
     */
    @RequestMapping("/insert")
    public int insert(@RequestBody Order order) {
        return orderService.insert(order);
    }

    /**
     * 根据订单Id更新订单
     *
     * @param order
     * @return
     */
    @RequestMapping("/update")
    public int update(@RequestBody Order order) {
        return orderService.update(order);
    }

    /**
     * 根据订单Id删除
     *
     * @param id
     * @return
     */
    @RequestMapping("/deleteById")
    public int deleteById(Long id) {
        return orderService.deleteById(id);
    }
}

