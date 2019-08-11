package com.huawei.minitask.model;

import lombok.Data;

/**
 * created by zsj in 16:05 2019/8/11
 * description:
 **/
@Data
public class User {
    private int id;

    private String name;

    private String password;

    private String salt;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.salt = "";
    }
}
