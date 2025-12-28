package com.alberto.email_service.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/")
    public Map<String, Object> home(){

        Map<String, Object> response = new HashMap<>();
        response.put("name", "My API");
        response.put("version", "1.0.0");
        response.put("status", "running");
        response.put("docs", "/swagger-ui.html");
        return response;
    }
}
