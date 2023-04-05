package org.mamidi.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Value("${appName}")
	String appName;
	
	@Value("${java.home}")
	private String javaHome;
	
	
    @GetMapping("/greetings")
    public String sayGreetings() {
    	System.out.println("javaHome: "+javaHome);
        return "Good Morning!!! \n Welcome to My Applciation:"+appName;
    }
}
