package com.springcloud.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by Cline Chen on 2017/5/14.
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class FeignHystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignHystrixApplication.class, args);
    }
}
