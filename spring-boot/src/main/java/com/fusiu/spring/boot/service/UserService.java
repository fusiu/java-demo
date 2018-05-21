package com.fusiu.spring.boot.service;

import com.fusiu.spring.boot.model.UserDomain;

import java.util.List;

public interface UserService {
    UserDomain findOne(String userCode);

//    List<UserDomain> selectUsers();
}
