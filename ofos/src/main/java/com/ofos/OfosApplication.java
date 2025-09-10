package com.ofos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OfosApplication {

    @GetMapping("/")
    public String home() {
        return "Welcome to Online Food Ordering System!";
    }

    public static void main(String[] args) {
        SpringApplication.run(OfosApplication.class, args);
    }
}
