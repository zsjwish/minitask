package com.huawei.minitask.controller;


import com.huawei.minitask.model.User;
import com.huawei.minitask.service.impl.UserSericeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * created by zsj in 23:57 2019/8/12
 * description:
 **/
@RestController
public class UserController {
    @Autowired
    private UserSericeImpl userSerice;

    @RequestMapping(value = "/getUserById/{id}", method = RequestMethod.GET)
    public User getUserById(HttpServletRequest request, @PathVariable("id") int id) {
        return userSerice.getUserById(id);
    }
    @RequestMapping(value = "/queryAllUser", method = RequestMethod.GET)
    public List<User> getAllUser(HttpServletRequest request) {
        return userSerice.getAllUser();
    }
}
