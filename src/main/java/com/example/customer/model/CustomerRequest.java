package com.example.customer.model;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerRequest {

    @NotNull
    private String type;

    @NotNull
    private String number;
}
