package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/a")
    public String index(){
        return "index";
    }
    @GetMapping("/b")
    public String index1(){
        return "goodbye";
    }

}
