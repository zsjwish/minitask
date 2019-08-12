package com.huawei.minitask.dao;

import com.huawei.minitask.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * created by zsj in 16:10 2019/8/11
 * description:
 **/
@Mapper
@Transactional
public interface UserDao extends CrudRepository<User, Long>{
    User queryUserById(int id);
    List<User> queryUsersByName(String name);

//    boolean addUser(User user);
}
