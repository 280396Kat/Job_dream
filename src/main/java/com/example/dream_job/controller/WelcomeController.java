package com.example.dream_job.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class WelcomeController {

    @GetMapping("/hello/{name}")
    public String getIndex(@PathVariable String name, @RequestParam int age) {
        return "Hello, " + name + " " + age;
    }

    @GetMapping("/hello")
    public String getIndex(@RequestParam int age) {
        return "" + age;
    }
}
