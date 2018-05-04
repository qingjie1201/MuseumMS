package com.demo.app.service;

import com.demo.app.pojo.User;

import java.util.List;

public interface UserService {


    public List<User> getUsers(Integer userId);
}
