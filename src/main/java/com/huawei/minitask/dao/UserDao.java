package com.huawei.minitask.dao;

import com.huawei.minitask.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * created by zsj in 16:10 2019/8/11
 * description:
 **/
@Mapper
public interface UserDao{

    @Select("select * from user where id = #{id}")
    User queryUserById(@Param("id") int id);
    @Select("select * from user where name = #{name}")
    List<User> queryUsersByName(@Param("name") String name);
    @Select("select * from user")
    List<User> queryAllUser();
//    boolean addUser(User user);
}
