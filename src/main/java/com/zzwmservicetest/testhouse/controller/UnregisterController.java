package com.zzwmservicetest.testhouse.controller;

import com.netflix.discovery.EurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class UnregisterController {
    @Resource
    EurekaClient eurekaClient;

    @GetMapping(value = "/eureka_unregister")
    public String eurekaUnregister(HttpServletRequest httpServletRequest) {
        //用于从注册中心中摘除服务
        String serverName = httpServletRequest.getServerName();
        if (!"localhost".equals(serverName)) {
            return "error";
        }
        eurekaClient.shutdown();
        return "ok";
    }
}
