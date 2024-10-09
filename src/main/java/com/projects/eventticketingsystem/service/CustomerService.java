package com.projects.eventticketingsystem.service;

import com.projects.eventticketingsystem.model.Customer;
import com.projects.eventticketingsystem.model.Sponsor;
import com.projects.eventticketingsystem.model.Ticket;
import com.projects.eventticketingsystem.repo.CustomerRepo;
import com.projects.eventticketingsystem.repo.EventRepo;
import com.projects.eventticketingsystem.repo.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;
    @Autowired
    private EventRepo eventRepo;
    @Autowired
    private TicketRepo ticketRepo;




    public ResponseEntity<String> updateProfile(Customer customer) {
        customerRepo.save(customer);
        return ResponseEntity.ok("Customer updated successfully");
    }




    public ResponseEntity<List<Sponsor>> showSponsors(String title) {
        List<Sponsor> sponsors =  eventRepo.findSponsorsByEventTitle(title);
        return new ResponseEntity<>(sponsors, HttpStatus.OK);
    }

    public ResponseEntity<List<Ticket>> showAvailableTickets() {
        List<Ticket> tickets = ticketRepo.findAvailableTickets();
        return new ResponseEntity<>(tickets, HttpStatus.OK);
    }
}
