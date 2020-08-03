package com.stone.serviceImpl;

import com.stone.bean.User;
import com.stone.dao.UserDao;
import com.stone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS)
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public List<User> queryById(String id) {
        List<User> list = userDao.queryById(id);
        return list;
    }
}
