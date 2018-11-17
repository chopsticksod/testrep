package com.example.demo.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountServiceImpl {

    @RequestMapping("/")
    public String hello() {
        return "Hello World!";
    }

}
