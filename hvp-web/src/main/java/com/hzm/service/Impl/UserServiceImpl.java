package com.hzm.service.Impl;

import com.hzm.entity.User;
import com.hzm.mapper.UserMapper;

import com.hzm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public User Sel(int id) {
        return userMapper.Sel(id);
    }
    public int addUser(User user) {
        return userMapper.addUser(user);
    }
}
