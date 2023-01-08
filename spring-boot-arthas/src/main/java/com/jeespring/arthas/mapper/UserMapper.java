package com.jeespring.arthas.mapper;

import com.jeespring.arthas.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * UserMapper
 *
 * @author 张朝阳
 * @date 2023/1/8 23:48:48
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
