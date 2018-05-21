package com.fusiu.spring.boot.service.impl;

import com.fusiu.spring.boot.dao.UserDao;
import com.fusiu.spring.boot.model.UserDomain;
import com.fusiu.spring.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;
    @Override
    public UserDomain findOne(String userCode) {
        return userDao.select(userCode);
    }
}
