package com.example.sample.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HelloWorld")
public class HelloWorldController {
    
    @GetMapping
    public String hello(){
        return "Hello from codespace";
    }
}
