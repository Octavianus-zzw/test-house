package com.zzwmservicetest.testhouse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/say_hello")
    public String sayHello() {
        return "hello test-house";
    }
}
