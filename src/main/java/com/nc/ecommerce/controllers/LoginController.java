package com.nc.ecommerce.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/api")
public class LoginController {


    @RequestMapping("/login")
    public String getLogin() {
        return "login";
    }
}
