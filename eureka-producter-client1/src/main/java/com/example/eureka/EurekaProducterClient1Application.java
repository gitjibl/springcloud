package com.example.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaProducterClient1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProducterClient1Application.class, args);
    }

}
