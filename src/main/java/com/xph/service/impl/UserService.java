package com.xph.service.impl;

import com.xph.bean.User;
import com.xph.dao.IUserDao;
import com.xph.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    IUserDao userDao;

    @Override
    public List<User> findAll() throws Exception {
        return userDao.findAll();
    }

    @Override
    public int addUser(User user) throws Exception {
        return userDao.addUser(user);
    }

    @Override
    public int updatePasswordByUsername(User user) throws Exception {
        return userDao.updatePasswordByUsername(user);
    }

    @Override
    public int deleteUserByUsername(String username) throws Exception{
        return userDao.deleteUserByUsername(username);
    }

    @Override
    public void transactionManager(User user1, User user2) throws Exception {
        userDao.updatePasswordByUsername(user1);
        int i = 1 / 0 ;
        userDao.updatePasswordByUsername(user2);
    }
}
