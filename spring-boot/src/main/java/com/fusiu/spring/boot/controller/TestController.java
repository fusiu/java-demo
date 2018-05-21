package com.fusiu.spring.boot.controller;

import com.fusiu.spring.boot.model.UserDomain;
import com.fusiu.spring.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "test")
public class TestController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private UserService userService;

    @GetMapping("getNames")
    public List<Map<String, Object>> getNames(){
        String sql = "select * from user";
        return jdbcTemplate.queryForList(sql);
    }

    @GetMapping("getOne")
    public UserDomain getOne(){
        UserDomain bl0879 = userService.findOne("BL0879");
        return bl0879;
    }
}
