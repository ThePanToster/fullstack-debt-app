package com.example.pasir_zabkiewicz_albert.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class InfoController {

    @GetMapping("/api/info")
    public Map<String, String> info() {
        HashMap<String, String> map = new HashMap<>();
        map.put("appName", "Aplikacja Budżetowa");
        map.put("version", "1.0");
        map.put("message", "Witaj w aplikacji budżetowej stworzonej ze Spring Boot!");
        return map;
    }
}
