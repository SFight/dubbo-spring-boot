package com.spring.boot.example.service;

public interface GreetingService {
    /**
     * 接口，对某人说hello
     * @param name 名称
     * @return hello ${name}
     */
    String sayHello(String name);
}
