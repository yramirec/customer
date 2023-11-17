package com.example.customer.service.impl;

import com.example.customer.service.FactorialService;
import org.springframework.stereotype.Service;

@Service
public class FactorialServiceImpl implements FactorialService {
    @Override
    public long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
