package com.online.shop.project.demo.controller;

import com.online.shop.project.demo.dao.UserDAO;
import com.online.shop.project.demo.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserRestController {

    private UserDAO userDAO;

    public UserRestController(UserDAO theUserDao){
        this.userDAO = theUserDao;
    }

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable int theId){

        return userDAO.findUserById(theId);

    }


}
