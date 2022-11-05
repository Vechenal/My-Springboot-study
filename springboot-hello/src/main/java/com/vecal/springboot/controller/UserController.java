package com.vecal.springboot.controller;

import com.vecal.springboot.entity.User;
import com.vecal.springboot.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ZCH
 * @Description
 * @create 2022-11-05 22:41
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserService userService;


    @RequestMapping(value = "/add")
    public User add(User user) {
        userService.addUser(user);
        return user;
    }

    @RequestMapping(value = "list")
    public List<User> list() {
        return userService.list();
    }

}
