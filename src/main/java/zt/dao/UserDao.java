package zt.dao;

import org.apache.ibatis.annotations.Param;
import zt.entity.User;

public interface UserDao{
    User login(@Param("username") String username,
            @Param("password") String password);
    User findByUsername(String username);
    void add(User user);
}
