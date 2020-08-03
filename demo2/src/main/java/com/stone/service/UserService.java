package com.stone.service;

import com.stone.bean.User;

import java.util.List;

public interface UserService {
    List<User> queryById(String id);
}
