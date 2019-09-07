package com.iee.orm.pagehelper.controller;

import com.iee.orm.pagehelper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author longxiaonan@163.com
 * @Date 2018/8/8 16:50
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("testfindUserListByPage")
    public void findUserListByPage(Integer pageNum, Integer pageSize){
        userService.findUserListByPage(pageNum,pageSize);
    }
}
