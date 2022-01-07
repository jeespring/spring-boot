package com.jeespring.sharding.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jeespring.sharding.entity.OrderItem;
import com.jeespring.sharding.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * OrderItemController
 *
 * @author 张朝阳
 * @date 2022/1/7 3:23 下午
 */
@RestController
@RequestMapping("/orderitem")
public class OrderItemController {

    @Resource
    private OrderItemService orderItemService;

    /**
     * 查询订单信息
     *
     * @param orderItem
     * @return
     */
    @RequestMapping("/select")
    public List<OrderItem> select(@RequestBody OrderItem orderItem) {
        return orderItemService.select(orderItem);
    }

    /**
     * 分页查询订单信息
     *
     * @param orderItem
     * @param pageNumber
     * @param pageSize
     * @return
     */
    @RequestMapping("/selectPage")
    public IPage<OrderItem> selectPage(@RequestBody OrderItem orderItem, int pageNumber, int pageSize) {
        return orderItemService.selectPage(orderItem, pageNumber, pageSize);
    }

    /**
     * 更加用户Id查询全部订单
     * @param userId
     * @return
     */
    @RequestMapping("/selectByUserId")
    public List<OrderItem> selectByUserId(Long userId) {
        return orderItemService.selectByUserId(userId);
    }

    /**
     * 新增订单
     *
     * @param orderItem
     * @return
     */
    @RequestMapping("/insert")
    public int insert(@RequestBody OrderItem orderItem) {
        return orderItemService.insert(orderItem);
    }

    /**
     * 根据订单Id更新订单
     *
     * @param orderItem
     * @return
     */
    @RequestMapping("/update")
    public int update(@RequestBody OrderItem orderItem) {
        return orderItemService.update(orderItem);
    }

    /**
     * 根据订单Id删除
     *
     * @param id
     * @return
     */
    @RequestMapping("/deleteById")
    public int deleteById(Long id) {
        return orderItemService.deleteById(id);
    }
    
}
