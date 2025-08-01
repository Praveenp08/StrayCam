package com.straylove.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
public class RootController {
    
    @GetMapping("/")
    public ResponseEntity<Map<String, Object>> root() {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Welcome to StrayLove API");
        response.put("status", "UP");
        response.put("timestamp", LocalDateTime.now().toString());
        response.put("service", "StrayLove Backend");
        response.put("version", "1.0.0");
        response.put("description", "Backend API for strayLove application - helping stray animals find care and support");
        response.put("endpoints", Map.of(
            "health", "/health",
            "auth", "/api/v1/auth",
            "animals", "/api/v1/animals",
            "swagger", "/swagger-ui/index.html"
        ));
        
        return ResponseEntity.ok(response);
    }
} 