package com.online.shop.project.demo.service;

import com.online.shop.project.demo.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAllUsers();

    User findUserById(int theId);

    void saveUser(User theUser);

    void deleteUserById(int theId);

}
