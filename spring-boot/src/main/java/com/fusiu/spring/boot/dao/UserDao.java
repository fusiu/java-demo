package com.fusiu.spring.boot.dao;

import com.fusiu.spring.boot.model.UserDomain;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserDao {
    UserDomain select(String userCode);

//    List<UserDomain> selectUsers();
}
