package zt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import zt.dao.UserDao;
import zt.entity.User;
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public User login(String username, String password) {
        User user = userDao.login(username, password);
        return user;
    }
    @Override
    public void add(User user) {
        System.out.println("执行add");
        userDao.add(user);
    }
    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public User findByUsername(String username) {
        User user = userDao.findByUsername(username);
        return user;
    }
}
