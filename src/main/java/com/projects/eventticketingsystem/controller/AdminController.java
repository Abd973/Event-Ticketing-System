package com.projects.eventticketingsystem.controller;

import com.projects.eventticketingsystem.model.Admin;
import com.projects.eventticketingsystem.model.Event;
import com.projects.eventticketingsystem.model.Sponsor;
import com.projects.eventticketingsystem.model.Ticket;
import com.projects.eventticketingsystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    AdminService adminService;


    @GetMapping("/admin/{id}")
    public Admin getAdmin(@PathVariable int id) {
        return adminService.getAdmin(id);
    }


    @PostMapping("/event")
    public ResponseEntity<String> createEvent(@RequestBody Event event) {
        return adminService.createEvent(event);
    }

    @PostMapping("/sponsors")
    public ResponseEntity<String> addSponsors(@RequestBody List<Sponsor> sponsors)
    {
        return adminService.addSponsors(sponsors);
    }



    @PostMapping("/tickets")
    public ResponseEntity<String> addTickets(@RequestBody List<Ticket> tickets)
    {
        return adminService.addTickets(tickets);
    }


}
