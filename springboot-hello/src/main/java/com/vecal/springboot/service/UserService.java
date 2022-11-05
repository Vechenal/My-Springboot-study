package com.vecal.springboot.service;

import com.vecal.springboot.entity.User;

import java.util.List;

/**
 * @author ZCH
 * @Description
 * @create 2022-11-05 22:50
 */
public interface UserService {
    /**
     * 添加用户
     *
     * @param user
     */
    void addUser(User user);

    /**
     * 用户列表
     *
     * @return
     */
    List<User> list();
}
