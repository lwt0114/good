package com.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekeServer8763 {

    public static void main(String[] args) {
        SpringApplication.run(EurekeServer8763.class,args);
    }
}
