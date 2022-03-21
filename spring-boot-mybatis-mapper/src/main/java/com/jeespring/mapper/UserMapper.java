package com.jeespring.mapper;

import com.jeespring.entity.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 张朝阳
 * @since 2021-11-14 21:40:38
 */
public interface UserMapper extends Mapper<User> {

    List<User> selectByName(String name);
}
