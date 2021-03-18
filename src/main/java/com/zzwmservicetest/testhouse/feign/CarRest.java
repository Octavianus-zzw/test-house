package com.zzwmservicetest.testhouse.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "test-car")
public interface CarRest {
    @GetMapping(value = "/say_hello")
    String carSayHello();
}
