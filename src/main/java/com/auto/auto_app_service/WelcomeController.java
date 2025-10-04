package com.auto.auto_app_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the Auto App Service!";
    }
}
