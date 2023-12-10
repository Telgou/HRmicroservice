package com.example.hrmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HRmicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HRmicroserviceApplication.class, args);
    }

}
