package com.online.shop.project.demo.service;

import com.online.shop.project.demo.entity.User;

import java.util.List;

public class UserServiceImpl implements UserService{
    @Override
    public List<User> findAllUsers() {
        return List.of();
    }

    @Override
    public User findUserById(int theId) {
        return null;
    }

    @Override
    public void saveUser(User theUser) {

    }

    @Override
    public void deleteUserById(int theId) {

    }
}
