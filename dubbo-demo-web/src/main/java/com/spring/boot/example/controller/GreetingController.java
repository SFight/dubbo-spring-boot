package com.spring.boot.example.controller;

import com.spring.boot.example.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = {"/greeting"})
public class GreetingController {


    @Autowired
    private GreetingService greetingService;

    @RequestMapping(path = {""}, method = {RequestMethod.GET})
    public String sayHello(@RequestParam String name) {
        return greetingService.sayHello(name);
    }
}
