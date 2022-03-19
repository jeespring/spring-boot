package com.jeespring.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jeespring.entity.User;
import com.jeespring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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

    @RequestMapping("/selectById")
    public User selectById(Long id) {
        return userService.selectById(id);
    }

    @RequestMapping("/selectOne")
    public User selectOne(@RequestBody User user) {
        return userService.selectOne(user);
    }

    @RequestMapping("/selectBatchIds")
    public List<User> selectBatchIds(List<Long> ids) {
        return userService.selectBatchIds(ids);
    }

    @RequestMapping("/selectAll")
    public List<User> selectAll() {
        return userService.selectAll();
    }

    @RequestMapping("/selectList")
    public List<User> selectList(@RequestBody User user) {
        return userService.selectList(user);
    }

    @RequestMapping("/selectPage")
    public IPage<User> selectPage(@RequestBody User user, int pageNumber, int pageSize) {
        return userService.selectPage(user, pageNumber, pageSize);
    }

    @RequestMapping("/selectByMap")
    public List<User> selectByMap(@RequestBody User user) {
        return userService.selectByMap(user);
    }

    @RequestMapping("/count")
    public int count(@RequestBody User user) {
        return userService.count(user);
    }

    /**
     * 添加一条数据
     *
     * @param user
     * @return
     */
    @RequestMapping("/insert")
    public int insert(@RequestBody User user) {
        return userService.insert(user);
    }

    /**
     * 更新
     */

    /**
     * 根据条件更新
     *
     * @param user
     * @return
     */
    @RequestMapping("/update")
    public int update(@RequestBody User user) {
        return userService.update(user);
    }

    /**
     * 根据Id修改信息
     *
     * @param user
     * @return
     */
    @RequestMapping("/updateById")
    public int updateById(@RequestBody User user) {
        return userService.updateById(user);
    }


    /**
     * 删除
     */

    /**
     * 根据Id删除
     *
     * @param id
     * @return
     */
    @RequestMapping("/deleteById")
    public int deleteById(Long id) {
        return userService.deleteById(id);
    }

    /**
     * 根据条件批量删除
     *
     * @param user
     * @return
     */
    @RequestMapping("/delete")
    public int delete(@RequestBody User user) {
        return userService.delete(user);
    }

    /**
     * 根据map批量删除
     *
     * @param user
     * @return
     */
    @RequestMapping("/deleteByMap")
    public int deleteByMap(@RequestBody User user) {
        return userService.deleteByMap(user);
    }

    /**
     * 根据id批量删除
     *
     * @param ids
     * @return
     */
    @RequestMapping("/deleteBatchIds")
    public int deleteBatchIds(List<Long> ids) {
        return userService.deleteBatchIds(ids);
    }

    /**
     * 自定义查询
     *
     * @param name
     * @return
     */
    @RequestMapping("/selectByName")
    public List<User> selectByName(String name) {
        return userService.selectByName(name);
    }

    /**
     * 自定义分页查询
     *
     * @param user
     * @param pageNumber
     * @param pageSize
     * @return
     */
    @RequestMapping("/selectPageByAge")
    public IPage<User> selectPageByAge(@RequestBody User user, int pageNumber, int pageSize) {
        return userService.selectPageByAge(user, pageNumber, pageSize);
    }
}
