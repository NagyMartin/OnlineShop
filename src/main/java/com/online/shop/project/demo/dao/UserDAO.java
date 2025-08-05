package com.online.shop.project.demo.dao;

import com.online.shop.project.demo.entity.User;

import java.util.List;

public interface UserDAO {

    void saveUser(User theUser);

    User findUserById(int theId);

    User findUserByEmail(String theEmail);

    List<User> findAllUsers();

    List<User> findUserByLastName(String lastName);

    void updateUser(User theUser);

    void deleteUserById(int theId);

}
