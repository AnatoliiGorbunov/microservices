package ru.geekbrains.discovery_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MainDiscoveryService {
    public static void main(String[] args) {
        SpringApplication.run(MainDiscoveryService.class, args);
    }

}
