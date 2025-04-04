package com.example.quepokemono.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public ResponseEntity<Map<String, Object>> handleError() {
        Map<String, Object> errorDetails = new HashMap<>();
        errorDetails.put("error", "Not found");
        errorDetails.put("status", HttpStatus.NOT_FOUND.value());
        errorDetails.put("message", "The requested URL does not exist on the server.");
        errorDetails.put("timestamp", System.currentTimeMillis());

        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }
}
