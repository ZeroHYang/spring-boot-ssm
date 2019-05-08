package org.yh.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yh.ssm.bean.User;
import org.yh.ssm.mapper.user.UserMapper;

@Controller
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @ResponseBody
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") String id) {
        return userMapper.getUser(id);
    }

    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "Hello spring boot!";
    }
}
