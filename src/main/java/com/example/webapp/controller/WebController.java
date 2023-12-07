package com.example.webapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WebController {
    @Value("${environment.variable.one}")
    String varOne;
    @GetMapping
    public ResponseEntity get(){
        return ResponseEntity.ok(varOne);
    }

}
