package com.mvc;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;

@EnableEurekaClient
@SpringBootApplication
public class GateWay9527 {

    public static void main(String[] args) {
        SpringApplication.run(GateWay9527.class,args);
    }
}
