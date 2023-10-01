package com.example.Ecommerce.controller;

import com.example.Ecommerce.model.User;
import com.example.Ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("/user")
    public String createUser(List<User> user){
        userService.createUser(user);
        return "user created";
    }
    @GetMapping("/userById/{id}")
    public Optional<User> getUserById(@PathVariable Integer id){
        return userService.getUSerById(id);
    }
}
