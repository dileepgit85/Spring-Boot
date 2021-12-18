package org.mamidi.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/greetings")
    public String sayGreetings() {
        return "Good Morning!!!";
    }
}
