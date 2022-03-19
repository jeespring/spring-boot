package com.jeespring.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jeespring.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author 张朝阳
 * @since 2021-11-14 21:40:38
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    List<User> selectByName(String name);

    IPage<User> selectPageByAge(IPage<User> page, @Param("user") User user);
}
