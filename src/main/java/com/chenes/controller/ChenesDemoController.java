package com.chenes.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ChenesDemoController {

    @Value("${chenesfile}")
    private String name;


    @RequestMapping("/rest")
    public String restDemo1(){
        return name;
    }
}
