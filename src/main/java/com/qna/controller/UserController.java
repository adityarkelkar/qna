/**
 * @Author Aditya Kelkar
 */


package com.qna.controller;

import com.qna.data.User;
import com.qna.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;
    PasswordHash hash = new PasswordHash();

    @GetMapping(value = "/hello")
    public String getWelcomeMessage() {
        return "Hi there";
    }

    @PostMapping(value = "/user/login")
    public User getUserByEmail(@RequestBody User user) {
        String securePass = hash.getHash(user.getPassword());
        return userService.userLogin(user.getEmail(), securePass);
    }

    @PostMapping(value = "/user/add")
    public String addUser(@RequestBody User user) {
        String securePass = hash.getHash(user.getPassword());
        user.setPassword(securePass);
        userService.addUser(user);
        return user.toString();
    }
}
