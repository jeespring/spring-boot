package com.jeespring.sharding.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jeespring.sharding.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * OrderMapper
 *
 * @author 张朝阳
 * @date 2022/1/6 4:20 下午
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

    List<Order> selectByUserId(Long userId);
}
