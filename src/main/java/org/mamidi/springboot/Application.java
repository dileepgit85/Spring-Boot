package org.mamidi.springboot;

import org.mamidi.springboot.beans.Policy;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);
    	ConfigurableApplicationContext context = new SpringApplicationBuilder(Application.class).bannerMode(Banner.Mode.OFF).build().run(args);
        System.out.println("Spring Boot application is running!!! ");
        System.out.println("Local Branch Changes.......... >>>");
        Policy policy = context.getBean(Policy.class);
        System.out.println(policy);
    }

}
