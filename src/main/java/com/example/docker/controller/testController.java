package com.example.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class testController {

    @GetMapping
    public String getAllTasks() {
        return "Hello docker !";
    }
}
