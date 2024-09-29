package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/public/hello")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/welcome")
    public ResponseEntity<String> welcome(@RequestHeader("access_token") String authorization) {
        System.out.println("进入");
//        if (authorization != null && !authorization.isEmpty()) {
//            return ResponseEntity.ok("Welcome! Your Authorization header is: " + authorization);
//        } else {
//            return ResponseEntity.status(401).body("Unauthorized: No Authorization header found");
//        }
        return ResponseEntity.ok("Welcome! Your Authorization header is: " + authorization);
    }
}
