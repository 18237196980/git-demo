package com.git.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public Object hello() {
        int b = 8;
        return "hello hyqhyqsmsm b=8";
    }

}
