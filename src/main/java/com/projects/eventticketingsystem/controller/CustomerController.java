package com.projects.eventticketingsystem.controller;

import com.projects.eventticketingsystem.model.Sponsor;
import com.projects.eventticketingsystem.model.Ticket;
import com.projects.eventticketingsystem.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.projects.eventticketingsystem.model.Customer;

import java.util.List;

@RestController
public class CustomerController {


    @Autowired
    private CustomerService customerService;


    @PutMapping("customer")
    public ResponseEntity<String> updateProfile(@RequestBody Customer customer)
    {
        return customerService.updateProfile(customer);
    }



    @GetMapping("sponsors/{title}")
    public ResponseEntity<List<Sponsor>> showSponsors(@PathVariable String title) {
        return customerService.showSponsors(title);
    }

    @GetMapping("tickets")
    public ResponseEntity<List<Ticket>> showAvailableTickets() {
        return customerService.showAvailableTickets();
    }

}
