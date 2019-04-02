package com.spring.boot.example.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    public String sayHello(String name) {
        return "hello " + name + ", welcome to beijing";
    }
}
