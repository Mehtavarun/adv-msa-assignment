package com.nagp.msa.service.impl;

import org.springframework.stereotype.Service;

import com.nagp.msa.entity.User;
import com.nagp.msa.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(Integer id) {
        return new User("Varun Mehta", 23, "wont_expose@publicaly.com");
    }
}
