package com.zzwmservicetest.testhouse.controller;

import com.zzwmservicetest.testhouse.feign.CarRest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {
    @Resource
    CarRest carRest;

    @GetMapping(value = "/say_hello")
    public String sayHello() {
        return "hello test-house";
    }

    @GetMapping(value = "/car_say_hello")
    public String carSayHello() {
        return carRest.carSayHello();
    }
}
