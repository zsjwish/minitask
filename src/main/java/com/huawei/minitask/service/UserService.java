package com.huawei.minitask.service;

import com.huawei.minitask.model.User;

import java.util.List;

/**
 * created by zsj in 23:53 2019/8/12
 * description:
 **/
public interface UserService {
    User getUserById(int id);
    List<User> getUsersByName(String name);
}
