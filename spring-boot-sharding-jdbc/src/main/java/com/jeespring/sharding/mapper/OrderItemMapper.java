package com.jeespring.sharding.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jeespring.sharding.entity.OrderItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * OrderItemMapper
 *
 * @author 张朝阳
 * @date 2022/1/7 3:19 下午
 */
@Mapper
public interface OrderItemMapper extends BaseMapper<OrderItem> {
    List<OrderItem> selectByUserId(Long userId);
}