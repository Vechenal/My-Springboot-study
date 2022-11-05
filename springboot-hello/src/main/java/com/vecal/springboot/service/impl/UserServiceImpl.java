package com.vecal.springboot.service.impl;

import com.vecal.springboot.dao.UserRepository;
import com.vecal.springboot.entity.User;
import com.vecal.springboot.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ZCH
 * @Description
 * @create 2022-11-05 22:49
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    /**
     * 添加用户
     *
     * @param user
     */
    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    /**
     * 用户列表
     *
     * @return
     */
    @Override
    public List<User> list() {
        return userRepository.findAll();
    }
}
