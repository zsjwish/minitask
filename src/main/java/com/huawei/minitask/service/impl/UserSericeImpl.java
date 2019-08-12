package com.huawei.minitask.service.impl;

import com.huawei.minitask.dao.UserDao;
import com.huawei.minitask.model.User;
import com.huawei.minitask.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by zsj in 23:55 2019/8/12
 * description:
 **/
@Service
public class UserSericeImpl implements UserService {

    @Autowired
    UserDao userDao;
    @Override
    public User getUserById(int id) {
        return userDao.queryUserById(id);
    }

    @Override
    public List<User> getUsersByName(String name) {
        return userDao.queryUsersByName(name);
    }
}
