package org.example.servicediscovery_may2024;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceDiscoveryMay2024Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscoveryMay2024Application.class, args);
    }

}
