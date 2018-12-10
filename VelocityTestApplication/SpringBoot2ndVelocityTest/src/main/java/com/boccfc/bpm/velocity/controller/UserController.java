package com.boccfc.bpm.velocity.controller;

import com.boccfc.bpm.velocity.User;
import com.boccfc.bpm.velocity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/list")
    public String getUsers(Model model){
        List<User> list =userService.getUsersInformation();
        return null;
    }
}
