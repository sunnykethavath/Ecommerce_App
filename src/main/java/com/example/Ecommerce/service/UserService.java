package com.example.Ecommerce.service;

import com.example.Ecommerce.model.User;
import com.example.Ecommerce.repo.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    IUser userRepo;

    public void createUser(List<User> user) {
        userRepo.saveAll(user);
    }

    public Optional<User> getUSerById(Integer id) {
        return userRepo.findById(id);
    }
}
