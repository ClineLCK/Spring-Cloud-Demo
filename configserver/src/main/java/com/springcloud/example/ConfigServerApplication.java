package com.springcloud.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by Cline Chen on 2017/5/16.
 */

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {


    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigServerApplication.class).web(true).run(args);
    }

}
