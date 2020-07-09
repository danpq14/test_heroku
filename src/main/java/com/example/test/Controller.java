package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/abc")
    public String index(){
        return "index";
    }
}
