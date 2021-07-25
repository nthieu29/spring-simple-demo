package com.nthieu.springsimpledemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("divisions")
public class DummyErrorController {
    @GetMapping("{a}/{b}")
    public int getDivisionResult(@PathVariable int a, @PathVariable int b) {
        return a / b;
    }
}
