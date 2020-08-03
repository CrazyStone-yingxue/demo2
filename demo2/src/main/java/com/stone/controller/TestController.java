package com.stone.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.stone.bean.User;
import com.stone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/testController")
@Validated
public class TestController {
    @Autowired
    private UserService userService;

    @RequestMapping("/test1")
    public Object test1(@RequestParam(required = false) String id) {
        List<User> list = userService.queryById(id);
        return list;
    }
}
