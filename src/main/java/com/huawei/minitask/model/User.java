package com.huawei.minitask.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * created by zsj in 16:05 2019/8/11
 * description:
 **/
@Data
@Table(name = "user")
public class User {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;
    @Column(name = "salt")
    private String salt;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.salt = "";
    }
}
