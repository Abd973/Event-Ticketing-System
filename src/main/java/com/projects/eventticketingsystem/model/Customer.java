package com.projects.eventticketingsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Customer {
    @Id
    int customerId;
    private String name;
    private int age;
    private String email;
    @OneToMany
    private List<Ticket> tickets;
}
