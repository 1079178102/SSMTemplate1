package com.xph.controller;

import com.xph.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/login")
    public String login(User user){
        System.out.println(user.toString());
        if("123".equals(user.getUsername()) && "123".equals(user.getPassword()))
            return "success";
        else
            return "error";
    }
}
