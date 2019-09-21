package com.xph.test;

import com.xph.bean.User;
import com.xph.service.impl.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void findAll() throws Exception {
        List<User> users = userService.findAll();
        users.forEach(i-> System.out.println(i));
    }

    @Test
    public void addUser() throws Exception {
        User user = new User(null,"jj","123",1);
        userService.addUser(user);
    }

    @Test
    public void updatePasswordByUsername() throws Exception {
        User user = new User(null,"3113","3113",null);
        userService.updatePasswordByUsername(user);
    }

    @Test
    public void deleteUserByUsername() throws Exception {
        userService.deleteUserByUsername("jj");
    }

    @Test
    public void transactionManagerTest() throws Exception {
//        User user1 = new User(null,"3113","3113",null);
//        User user2 = new User(null,"123456","123456",null);

        User user1 = new User(null,"3113","777",null);
        User user2 = new User(null,"123456","888",null);

        userService.transactionManager(user1,user2);

    }
}
