package com.example.customer.service;

import com.example.customer.model.Customer;

public interface CustomerService {
    public Customer getCustomer(String type, String number);
}
