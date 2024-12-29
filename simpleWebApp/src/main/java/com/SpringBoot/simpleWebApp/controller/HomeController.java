package com.SpringBoot.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    private String greet(){
        return "Welcome ";
    }

    @RequestMapping("/about")
    private String about(){
        return "We are great";
    }
}
