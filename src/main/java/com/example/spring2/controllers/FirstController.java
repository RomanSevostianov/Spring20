package com.example.spring2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping
    public String helloWeb (){
        return  "hello Web";
    }
    @GetMapping("/path/to/page")
    public String page (@RequestParam String page){
        return  "page 1"+ page;
    }
}
