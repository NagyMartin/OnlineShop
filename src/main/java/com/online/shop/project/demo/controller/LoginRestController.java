package com.online.shop.project.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginRestController {

    @GetMapping("/")
    public String logIn(Model theModel){

        theModel.addAttribute("theDate", new java.util.Date());

        return "loginform";
    }

}
