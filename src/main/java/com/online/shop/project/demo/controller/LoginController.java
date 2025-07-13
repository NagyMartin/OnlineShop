package com.online.shop.project.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String logIn(Model theModel){

        theModel.addAttribute("theDate", new java.util.Date());

        return "loginform";
    }

}
