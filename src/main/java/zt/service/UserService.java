package zt.service;

import zt.entity.User;

import java.util.List;

public interface UserService {
    User login(String username,String password);
    void add(User user);
    User findByUsername(String username);

}
