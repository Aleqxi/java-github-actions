package com.example;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping
    public String demo() {
        return "Hello world";
    }
    
}
