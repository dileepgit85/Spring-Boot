package org.mamidi.springboot.controller;

import org.mamidi.springboot.service.HelloService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Value("${appName}")
	String appName;

	@Value("${java.home}")
	private String javaHome;

	private final HelloService helloService;
	private final String finalStringVlue;
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
		this.finalStringVlue = "Final String Value";
    }




    @GetMapping("/greetings")
    public String sayGreetings() {
    	System.out.println("javaHome: "+javaHome);
        return "Good Morning!!! \n Welcome to My Applciation:"+appName;
    }
}
