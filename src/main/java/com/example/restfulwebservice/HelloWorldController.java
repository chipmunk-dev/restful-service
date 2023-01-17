package com.example.restfulwebservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    // GET
    // /hello-world (endPoint)
    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }
}