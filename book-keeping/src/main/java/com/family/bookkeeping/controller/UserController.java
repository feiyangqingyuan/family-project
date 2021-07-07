package com.family.bookkeeping.controller;

import com.family.bookkeeping.entity.User;
import com.family.bookkeeping.service.UserService;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (User)表控制层
 *
 * @author feiya
 * @since 2021-07-07 15:26:04
 */
@RestController
@RequestMapping("user")
public class UserController {

    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public User selectOne(Long id) {
        return this.userService.queryById(id);
    }

}
