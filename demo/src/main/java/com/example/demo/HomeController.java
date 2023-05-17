package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    //Khi User truy cap vao endpoint / thi Homepage() duoc goi
    @GetMapping("/")
    public String homepage(){
        return "index";
    }
}
