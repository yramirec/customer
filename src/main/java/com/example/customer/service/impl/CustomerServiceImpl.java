package com.example.customer.service.impl;

import com.example.customer.model.Customer;
import com.example.customer.service.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public Customer getCustomer(String type, String number) {
        if ("C".equals(type) && "23445322".equals(number)) {
            return new Customer("John", "Adrian", "Rios", "Delgado", "987654321", "Street 200", "Lima");
        }

        return null;
    }
}
