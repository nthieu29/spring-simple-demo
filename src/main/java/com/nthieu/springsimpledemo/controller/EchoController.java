package com.nthieu.springsimpledemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("echo")
public class EchoController {
    @GetMapping
    public String getHelloWorld() {
        return "Hello World";
    }
}
