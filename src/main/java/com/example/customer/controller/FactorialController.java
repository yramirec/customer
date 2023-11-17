package com.example.customer.controller;

import com.example.customer.service.impl.FactorialServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialController {
    @Autowired
    private FactorialServiceImpl factorialService;

    @GetMapping("/api/factorial/{numero}")
    public ResponseEntity<String> calculateFactorial(@PathVariable int numero) {
        long factorial = factorialService.factorial(numero);
        return new ResponseEntity<>("{\"factorial\":\"" + factorial + "\"}", HttpStatus.OK);
    }
}
