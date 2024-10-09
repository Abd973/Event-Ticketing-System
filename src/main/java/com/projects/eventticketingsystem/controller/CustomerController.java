package com.projects.eventticketingsystem.controller;

import com.projects.eventticketingsystem.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projects.eventticketingsystem.model.Customer;

@RestController
public class CustomerController {


    @Autowired
    private CustomerService customerService;


    @PutMapping("customer")
    public ResponseEntity<String> updateProfile(@RequestBody Customer customer)
    {
        return customerService.updateProfile(customer);
    }



}
