package com.zzwmservicetest.testhouse;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableApolloConfig
@EnableFeignClients
public class TestHouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestHouseApplication.class, args);
    }

}
