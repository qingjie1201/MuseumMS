package com.demo.app.service.impl;

import com.demo.app.dao.mapper.UserMapper;
import com.demo.app.pojo.User;
import com.demo.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    public List<User> getUsers(Integer userId) {
        return userMapper.queryById(userId);
    }
}
