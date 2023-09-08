package com.jewel.poll.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class PageController {
    @GetMapping("/")
    public String homePage(){
        return "index.html";
    }

}
