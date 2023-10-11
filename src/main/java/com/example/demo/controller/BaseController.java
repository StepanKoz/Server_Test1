package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value="/base")


public class BaseController {
    @GetMapping("/input")
    protected void validateInput(Object input) throws IllegalArgumentException {
        if (input == null) {
            throw new IllegalArgumentException("Входные данные не могут быть null");
        }
    }
    @GetMapping("/log")
    protected void log(String message) {
        System.out.println(message);
    }
    @GetMapping("/sending")
    protected String sendNotification(String message) {
        return message;
    }

    }


//    @GetMapping("/hello")
//    public String hello(@RequestParam(value = "name", defaultValue = "world") String name) {
//        return String.format("Hello %s", name);
//
//    }
//
//    @GetMapping("/sum")
//    public Integer sum() {
//        return baseService.sum();
//    }
//
//    @GetMapping("/hello/{name}")
//    public String hi(@PathVariable("name") String name) {
//        return String.format("Hello %s", name);
//
//    }
//
//    @GetMapping("/minus")
//    public int minus() {
//        int fistt = 3;
//        int secondd = 1;
//        return fistt - secondd;
//    }


