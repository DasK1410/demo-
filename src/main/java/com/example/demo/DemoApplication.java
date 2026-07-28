package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main application class that serves as the entry point for the Spring Boot application.
 * The @SpringBootApplication annotation enables auto-configuration, component scanning,
 * and allows for extra configuration on their "application class".
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
