package org.mamidi.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("Spring Boot application is running!!! ");
        System.out.println("Local Branch Changes.......... ");
    }

}
