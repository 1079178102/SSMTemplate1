package com.xph.controller;

import com.xph.bean.User;
import com.xph.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String login(User user){
        int userByUsernamePassword = userService.findUserByUsernamePassword(user);
        if (userByUsernamePassword == 1){
            return "success";
        }else{
            return "error";
        }
    }
}
