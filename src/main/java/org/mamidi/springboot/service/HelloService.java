package org.mamidi.springboot.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    private void sayHello() {
        System.out.println("Hello from HelloService");
    }
}
