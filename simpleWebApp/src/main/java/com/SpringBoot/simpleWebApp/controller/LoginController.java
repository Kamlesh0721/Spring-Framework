package com.SpringBoot.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
        @RequestMapping("/login")
        public String userAuth(){
            return "authenticate";
        }
}
