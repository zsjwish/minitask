package com.huawei.minitask.controller;


import com.huawei.minitask.model.User;
import com.huawei.minitask.service.impl.UserSericeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * created by zsj in 23:57 2019/8/12
 * description:
 **/
@RestController
public class UserController {
    @Autowired
    UserSericeImpl userSerice;

    @RequestMapping(value = "getUserById", method = RequestMethod.GET)
    public User getUserById(HttpServletRequest request, @PathVariable("id") int id) {
        return userSerice.getUserById(id);
    }
}
