package com.hzm.service;

import com.hzm.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User Sel(int id);
    int addUser(User user);
}
