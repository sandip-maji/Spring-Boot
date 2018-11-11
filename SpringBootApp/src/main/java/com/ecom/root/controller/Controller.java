package com.ecom.root.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/info")
    public String getAppInfo(){
        return "Spring-Boot-Application";
    }
    
    @GetMapping("/getCall")
    public String getCall(){
        return "Spring-Boot-GetCall";
    }
    
    @PostMapping("/postCall")
    public String postCall(){
        return "Spring-Boot-PostCall";
    }

}
