package com.pshekhar.remoteconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableConfigServer
public class RemoteConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(RemoteConfigApplication.class, args);
    }

}
