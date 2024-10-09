package com.projects.eventticketingsystem.service;

import com.projects.eventticketingsystem.model.Customer;
import com.projects.eventticketingsystem.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepo customerRepo;



    public ResponseEntity<String> updateProfile(Customer customer) {
        customerRepo.save(customer);
        return ResponseEntity.ok("Customer updated successfully");
    }


}
