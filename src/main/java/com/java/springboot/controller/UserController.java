package com.java.springboot.controller;

import com.java.springboot.entities.User;
import com.java.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // api point for register
    @PostMapping("/registeruser")
    public User registerUser(@RequestBody User user) throws Exception {
        return this.userService.registerUser(user);
    }

    // api point for signin
    @PostMapping("/signinuser")
    public String signinUser(@RequestBody User user) throws Exception {
        return this.userService.signinUser(user);
    }

}
