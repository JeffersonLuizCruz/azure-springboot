package com.azure.springbootjava17.controller;

import com.azure.springbootjava17.entity.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {



    @GetMapping
    public Customer customer(){
        return new Customer(1L, "Jefferson Luiz", "Welcome Jefferson!");
    }
}
