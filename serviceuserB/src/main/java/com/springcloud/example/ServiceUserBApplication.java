package com.springcloud.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Cline Chen on 2017/5/14.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceUserBApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceUserBApplication.class, args);
    }

}
