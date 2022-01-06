package com.dio.springboottest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String greeting(@RequestParam(name="name", defaultValue = "Caio") String name) {
        return String.format("Welcome, %s", name);
    }

}
