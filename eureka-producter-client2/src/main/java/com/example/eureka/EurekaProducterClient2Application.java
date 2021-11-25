package com.example.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaProducterClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProducterClient2Application.class, args);
    }

}
