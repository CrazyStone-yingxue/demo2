package com.stone.dao;

import com.stone.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    List<User> queryById(@Param("id") String id);
}
