package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix
@SpringBootApplication
public class providerhystrix8001 {

    public static void main(String[] args) {
        SpringApplication.run(providerhystrix8001.class,args);
    }
}
