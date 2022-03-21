package com.jeespring.controller;

import com.github.pagehelper.PageInfo;
import com.jeespring.entity.User;
import com.jeespring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 张朝阳
 * @description UserController
 * @date 2022/3/14 18:39:39
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/selectByPrimaryKey")
    public User selectByPrimaryKey(Long id) {
        return userService.selectByPrimaryKey(id);
    }

    @RequestMapping("/selectOne")
    public User selectOne(User user) {
        return userService.selectOne(user);
    }

    @RequestMapping("/select")
    public List<User> select(User user) {
        return userService.select(user);
    }

    @RequestMapping("/selectAll")
    public List<User> selectAll() {
        return userService.selectAll();
    }

    @RequestMapping("/selectById")
    public int selectList(User user) {
        return userService.selectList(user);
    }

    @RequestMapping("/selectByExample")
    public List<User> selectByExample(User user) {
        return userService.selectByExample(user);
    }

    @RequestMapping("/selectPage")
    public PageInfo<User> selectPage(User user, int pageNumber, int pageSize) {
        return userService.selectPage(user,pageNumber,pageSize);
    }

    @RequestMapping("/selectByName")
    public List<User> selectByName(String name) {
        return userService.selectByName(name);
    }

    @RequestMapping("/selectCount")
    public int selectCount(User user) {
        return userService.selectCount(user);
    }

    /**
     * 新增数据
     * @param user
     * @return
     */
    @RequestMapping("/insert")
    public int insert(User user) {
        return userService.insert(user);
    }

    /**
     * 新增数据，过滤不为空的字段
     * @param user
     * @return
     */
    @RequestMapping("/insertSelective")
    public int insertSelective(User user) {
        return userService.insertSelective(user);
    }

    /**
     * 更新
     */

    /**
     * 根据主键更新全部字段
     * @param user
     * @return
     */
    @RequestMapping("/updateByPrimaryKey")
    public int updateByPrimaryKey(User user) {
        return userService.updateByPrimaryKey(user);
    }

    /**
     * 根据主键更新不为空的字段
     * @param user
     * @return
     */
    @RequestMapping("/updateByPrimaryKeySelective")
    public int updateByPrimaryKeySelective(User user) {
        return userService.updateByPrimaryKeySelective(user);
    }


    /**
     * 删除
     */

    /**
     * 根据Id删除
     * @param id
     * @return
     */
    @RequestMapping("/deleteByPrimaryKey")
    public int deleteByPrimaryKey(Long id) {
        return userService.deleteByPrimaryKey(id);
    }

    /**
     * 根据条件删除
     * @param user
     * @return
     */
    @RequestMapping("/delete")
    public int delete(User user) {
        return userService.delete(user);
    }

    /**
     * 根据条件删除
     * @param user
     * @return
     */
    @RequestMapping("/deleteByExample")
    public int deleteByExample(User user) {
        return userService.deleteByExample(user);
    }
}
