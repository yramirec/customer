package com.example.customer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/api/hola")
    public ResponseEntity<String> sayHello() {
        return new ResponseEntity<>("{\"message\":\"Hola, Equipo Carpe diem\"}", HttpStatus.OK);
    }
}
