package com.projects.eventticketingsystem.service;

import com.projects.eventticketingsystem.model.Admin;
import com.projects.eventticketingsystem.model.Event;
import com.projects.eventticketingsystem.model.Sponsor;
import com.projects.eventticketingsystem.model.Ticket;
import com.projects.eventticketingsystem.repo.AdminRepo;
import com.projects.eventticketingsystem.repo.EventRepo;
import com.projects.eventticketingsystem.repo.SponsorRepo;
import com.projects.eventticketingsystem.repo.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    AdminRepo adminRepo;
    @Autowired
    EventRepo eventRepo;
    @Autowired
    SponsorRepo sponsorRepo;
    @Autowired
    TicketRepo ticketRepo;




    public ResponseEntity<String> createEvent(Event event) {
        eventRepo.save(event);
//        int adminId = event.getAdmin().getId();
//        Admin admin = adminRepo.findById(adminId).get();
//        admin.getEvents().add(event);
//        adminRepo.save(admin);
        List<Ticket> tickets = event.getTickets();
        for (Ticket ticket : tickets) {
            ticket.setEvent(event);
            ticketRepo.save(ticket);
        }

        return new ResponseEntity<>("succeed", HttpStatus.OK);
    }




    public Admin getAdmin(int id) {
        return adminRepo.findById(id).orElse(null);
    }

    public ResponseEntity<String> addSponsors(List<Sponsor> sponsors) {
        sponsorRepo.saveAll(sponsors);
        return new ResponseEntity<>("Sponsors added successfully!", HttpStatus.OK);
    }

    public ResponseEntity<String> addTickets(List<Ticket> tickets) {
        ticketRepo.saveAll(tickets);
        return new ResponseEntity<>("Tickets added successfully!", HttpStatus.OK);
    }
}
