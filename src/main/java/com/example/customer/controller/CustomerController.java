package com.example.customer.controller;

import com.example.customer.model.Customer;
import com.example.customer.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {
    @Autowired
    private CustomerServiceImpl customerService;

    @GetMapping("/api/customer")
    public ResponseEntity<Customer> getCustomer(@RequestParam String type, @RequestParam String number) {
        if (type == null || number == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Customer customer = customerService.getCustomer(type, number);
        if (customer == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
}
