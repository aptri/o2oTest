package com.imooc.o2o.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegisterController {

    @RequestMapping("/toRegister")
    public String toRegister(){
        return "view/register/register";
    }
}
