package com.xph.test;

import com.xph.bean.User;
import com.xph.dao.IUserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserDaoTest {

    @Autowired
    IUserDao userDao;

    @Test
    public void login(){
        User user = new User(null,"3113","3113",null);
        int count = userDao.findUserByUsernamePassword(user);
        System.out.println(count);
    }

    @Test
    public void findAll() throws Exception {
        List<User> users = userDao.findAll();
        users.forEach(i-> System.out.println(i));
    }

    @Test
    public void addUser() throws Exception {
        User user = new User();
        user.setUsername("jj");
        user.setPassword("jiji");
        user.setStatus(1);
        int i = userDao.addUser(user);
        System.out.println("addUser:[" + i + "]");
    }

    @Test
    public void updatePasswordByUsername() throws Exception {
        User user = new User();
        user.setUsername("3113");
        user.setPassword("123");
        int i = userDao.updatePasswordByUsername(user);
        System.out.println("updatePasswordByUsername:[" + i + "]");
    }

    @Test
    public void deleteUserByUsername() throws Exception {
        int i = userDao.deleteUserByUsername("jj");
        System.out.println("deleteUserByUsername:[" + i + "]");
    }

}
